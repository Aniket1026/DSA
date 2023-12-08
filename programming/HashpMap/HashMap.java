package programming.HashpMap;

import java.util.ArrayList;
import java.util.LinkedList;

public class HashMap<K,V> {
    private class HMNode{
		K key;
		V value;
		public HMNode(K key, V value){
          this.key = key;
		  this.value = value;
		}
    }
	private int size;
	private final float loadFactor = 2;
	private LinkedList<HMNode>[] buckets;
	public HashMap(){
		initBucket(4);
		size =0;
	}
	private void initBucket(int n){
		buckets = new LinkedList[n];
		for(int bucketIndex =0; bucketIndex<buckets.length;bucketIndex++){
		    buckets[bucketIndex] = new LinkedList<>();
		}
	}

	public void put (K key , V value){
		int bi = hashFn(key);
		int di = getIndexWithinBucket(bi , key);

		if(di != -1){
			HMNode node = buckets[bi].get(di);
			node.value = value;
		}else{
			HMNode node = new HMNode(key,value);
            buckets[bi].add(node);
			size++;
		}
		double lambda = (size * 1.0)/buckets.length;
		if(lambda>loadFactor) reHash();
	}

	public boolean containsKey(K key){
		int bi = hashFn(key);
		int di = getIndexWithinBucket(bi , key);
		return di != -1;
	}

	public V get (K key){
		int bi = hashFn(key);
		int di = getIndexWithinBucket(bi , key);
		return di != -1 ? buckets[bi].get(di).value :null;
	}
	public V remove(K key){
		int bi = hashFn(key);
		int di = getIndexWithinBucket(bi , key);
		if(di !=-1){
			size--;
			return buckets[bi].remove(di).value;
		}else{
			return null;
		}
	}

	public ArrayList<K> keySet(){
		ArrayList<K> list = new ArrayList<>();
		for (LinkedList<HMNode> bucket : buckets) {
			for (HMNode node : bucket) {
				list.add(node.key);
			}
		}
		return list;
	}
	public int size(){
		return size;
	}

	private int hashFn(K key){
		return Math.abs(key.hashCode() % buckets.length);
	}

	private int getIndexWithinBucket(int bucketIndex , K key){
		int keyIndex =0;
		for(HMNode node : buckets[bucketIndex]){
			if(node.key.equals(key)) return keyIndex;
			keyIndex++;
		}
		return -1;
	}

	private void reHash(){
          LinkedList<HMNode> [] oba = buckets;
		  initBucket(buckets.length * 2);
		  size =0;

		for (LinkedList<HMNode> bucket : buckets) {
			for (HMNode node : bucket) {
				put(node.key, node.value);
			}
		}
	}
}
