/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.tts.v20190823.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Subtitle extends AbstractModel{

    /**
    * ⽂本信息。
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
    * ⽂本对应tts语⾳开始时间戳，单位ms。
    */
    @SerializedName("BeginTime")
    @Expose
    private Long BeginTime;

    /**
    * ⽂本对应tts语⾳结束时间戳，单位ms。
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * 该字在整句中的开始位置，从0开始。
    */
    @SerializedName("BeginIndex")
    @Expose
    private Long BeginIndex;

    /**
    * 该字在整句中的结束位置，从0开始。
    */
    @SerializedName("EndIndex")
    @Expose
    private Long EndIndex;

    /**
    * 该字的音素
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Phoneme")
    @Expose
    private String Phoneme;

    /**
     * Get ⽂本信息。 
     * @return Text ⽂本信息。
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set ⽂本信息。
     * @param Text ⽂本信息。
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    /**
     * Get ⽂本对应tts语⾳开始时间戳，单位ms。 
     * @return BeginTime ⽂本对应tts语⾳开始时间戳，单位ms。
     */
    public Long getBeginTime() {
        return this.BeginTime;
    }

    /**
     * Set ⽂本对应tts语⾳开始时间戳，单位ms。
     * @param BeginTime ⽂本对应tts语⾳开始时间戳，单位ms。
     */
    public void setBeginTime(Long BeginTime) {
        this.BeginTime = BeginTime;
    }

    /**
     * Get ⽂本对应tts语⾳结束时间戳，单位ms。 
     * @return EndTime ⽂本对应tts语⾳结束时间戳，单位ms。
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set ⽂本对应tts语⾳结束时间戳，单位ms。
     * @param EndTime ⽂本对应tts语⾳结束时间戳，单位ms。
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 该字在整句中的开始位置，从0开始。 
     * @return BeginIndex 该字在整句中的开始位置，从0开始。
     */
    public Long getBeginIndex() {
        return this.BeginIndex;
    }

    /**
     * Set 该字在整句中的开始位置，从0开始。
     * @param BeginIndex 该字在整句中的开始位置，从0开始。
     */
    public void setBeginIndex(Long BeginIndex) {
        this.BeginIndex = BeginIndex;
    }

    /**
     * Get 该字在整句中的结束位置，从0开始。 
     * @return EndIndex 该字在整句中的结束位置，从0开始。
     */
    public Long getEndIndex() {
        return this.EndIndex;
    }

    /**
     * Set 该字在整句中的结束位置，从0开始。
     * @param EndIndex 该字在整句中的结束位置，从0开始。
     */
    public void setEndIndex(Long EndIndex) {
        this.EndIndex = EndIndex;
    }

    /**
     * Get 该字的音素
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Phoneme 该字的音素
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPhoneme() {
        return this.Phoneme;
    }

    /**
     * Set 该字的音素
注意：此字段可能返回 null，表示取不到有效值。
     * @param Phoneme 该字的音素
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPhoneme(String Phoneme) {
        this.Phoneme = Phoneme;
    }

    public Subtitle() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Subtitle(Subtitle source) {
        if (source.Text != null) {
            this.Text = new String(source.Text);
        }
        if (source.BeginTime != null) {
            this.BeginTime = new Long(source.BeginTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.BeginIndex != null) {
            this.BeginIndex = new Long(source.BeginIndex);
        }
        if (source.EndIndex != null) {
            this.EndIndex = new Long(source.EndIndex);
        }
        if (source.Phoneme != null) {
            this.Phoneme = new String(source.Phoneme);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Text", this.Text);
        this.setParamSimple(map, prefix + "BeginTime", this.BeginTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "BeginIndex", this.BeginIndex);
        this.setParamSimple(map, prefix + "EndIndex", this.EndIndex);
        this.setParamSimple(map, prefix + "Phoneme", this.Phoneme);

    }
}

