/**
 *
 */
package com.zhuandian.myapplication.ise.result;

/**
 * <p>Title: FinalResult</p>
 * <p>Description: </p>
 * <p>Company: www.iflytek.com</p>
 * @author iflytek
 * @date 2015年1月14日 上午11:12:58
 */
public class FinalResult extends Result {

    public int ret;

    public float total_score;

    public float fluency_score;

    public float integrity_score;

    public float phone_score;

    public float tone_score;

    @Override
    public String toString() {
        return "返回值：" + ret + "，总分：" + total_score + "--" + fluency_score + "--" + integrity_score + "---" + phone_score + "--" + tone_score;
    }
}
