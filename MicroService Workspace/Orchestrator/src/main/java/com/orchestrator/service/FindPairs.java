package com.orchestrator.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

/**
 * @author Makesh Kumar
 *
 */

public class FindPairs {
	
	static List<Float> L = new ArrayList<Float>();
	public List<Float>  getPair(String list, String sum){
		L = new ArrayList<Float>();
		System.out.println(list);
		System.out.println(sum);

		String[] items = list.replaceAll("\\{", "").replaceAll("\\}", "").replaceAll("\\s", "").split(",");
		float[] results = new float[items.length];
		for (int i = 0; i < items.length; i++) {
			try {
				results[i] = Float.parseFloat(items[i]);
			} catch (NumberFormatException nfe) {
				// Catch errors here ..
			}
			;

		}
		Float[] arr = new Float[results.length];
		int j = 0;
		for (float value : results) {
			arr[j++] = Float.valueOf(value);
		}
		float K = Float.parseFloat(sum);

//		Integer[] arr = { 1,2,3};
//		int K = 3;

		Vector<Float> A = new Vector<>(Arrays.asList(arr));
		Collections.sort(A);

		// To store combination
		Vector<Float> local = new Vector<Float>();
		unique_combination(0, 0, K, local, A);
		List<Float> res = new ArrayList<Float>();
		ListIterator<Float> iterator = L.listIterator();
		while (iterator.hasNext()) {
			float val = iterator.next();
			if (val == -1)
				break;
			res.add(val);
		}
		System.out.println(res);
		return res;
		
		
	}
	
	
	static void unique_combination(int l, float sum, float K, Vector<Float> local, Vector<Float> A) {
		;
		if (sum == K) {
			for (int i = 0; i < local.size(); i++) {
				L.add(local.get(i));
			}

			L.add((float) -1);
			return;
		}
		for (int i = l; i < A.size(); i++) {
			if (sum + A.get(i) > K)
				continue;
			if (i == 1 && A.get(i) == A.get(i - 1) && i > l)
				continue;
			local.add(A.get(i));
			unique_combination(i + 1, sum + A.get(i), K, local, A);
			local.remove(local.size() - 1);
		}
	}
}