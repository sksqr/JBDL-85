package org.gfg.collections.keywordAnalyser;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class UniqueKeywordAnalyzerImpl implements KeywordAnalyzerInterface{

    private Set<String> dataStore;

    public UniqueKeywordAnalyzerImpl() {
       // this.dataStore = new HashSet<>();
        this.dataStore = new LinkedHashSet<>();
    }

    @Override
    public void recordKeyword(String keyword) {
        dataStore.add(keyword);
    }

    @Override
    public List<String> getKeywords() {
        return dataStore.stream().toList();
    }
}
