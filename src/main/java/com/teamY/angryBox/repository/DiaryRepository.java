package com.teamY.angryBox.repository;

import com.teamY.angryBox.mapper.DiaryMapper;
import com.teamY.angryBox.vo.DiaryFileVO;
import com.teamY.angryBox.vo.DiaryVO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@Repository
public class DiaryRepository {
    private final DiaryMapper diaryMapper;

    public int insertDiary(DiaryVO diary) {
        int diaryId = diaryMapper.insertDiary(diary);
        return diaryId;
    }

    public void insertDiaryFile(int diaryId, int fileId, int fileNo) {
        diaryMapper.insertDiaryFile(diaryId, fileId, fileNo);
    }

    public List<DiaryVO> selectDiaryListInCoinBank(int memberId, int coinBankId) {
        return diaryMapper.selectDiaryListInCoinBank(memberId, coinBankId);
    }

    public List<DiaryFileVO> selectDiaryDetail(int diaryId) {
        return diaryMapper.selectDiaryDetail(diaryId);
    }

    public int selectDiaryMemberId(int diaryId, int memberId) {
        return diaryMapper.selectDiaryMemberId(diaryId, memberId);
    }

    public void deleteFileInDiary(int diaryId) {
        diaryMapper.deleteFileInDiary(diaryId);
    }

    public void deleteDiary(int diaryId) {
        diaryMapper.deleteDiary(diaryId);
    }
}
