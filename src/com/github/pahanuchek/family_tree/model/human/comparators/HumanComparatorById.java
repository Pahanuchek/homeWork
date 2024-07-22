package com.github.pahanuchek.family_tree.model.human.comparators;

import com.github.pahanuchek.family_tree.model.family_tree.ItemUser;

import java.util.Comparator;

public class HumanComparatorById<E extends ItemUser<E>> implements Comparator<E> {
    @Override
    public int compare(E o1, E o2) {
        return o1.getId() - o2.getId();
    }
}