/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
package com.tencentcloudapi.mrs.v20200910.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OtolaryngologyBaseItem extends AbstractModel {

    /**
    * 耳朵
    */
    @SerializedName("Ear")
    @Expose
    private OtolaryngologyEar Ear;

    /**
    * 鼻
    */
    @SerializedName("Nose")
    @Expose
    private OtolaryngologyNose Nose;

    /**
    * 喉
    */
    @SerializedName("Larynx")
    @Expose
    private OtolaryngologyLarynx Larynx;

    /**
    * 耳鼻喉其他
    */
    @SerializedName("Others")
    @Expose
    private KeyValueItem [] Others;

    /**
    * 小结
    */
    @SerializedName("BriefSummary")
    @Expose
    private OtolaryngologyBriefSummary BriefSummary;

    /**
     * Get 耳朵 
     * @return Ear 耳朵
     */
    public OtolaryngologyEar getEar() {
        return this.Ear;
    }

    /**
     * Set 耳朵
     * @param Ear 耳朵
     */
    public void setEar(OtolaryngologyEar Ear) {
        this.Ear = Ear;
    }

    /**
     * Get 鼻 
     * @return Nose 鼻
     */
    public OtolaryngologyNose getNose() {
        return this.Nose;
    }

    /**
     * Set 鼻
     * @param Nose 鼻
     */
    public void setNose(OtolaryngologyNose Nose) {
        this.Nose = Nose;
    }

    /**
     * Get 喉 
     * @return Larynx 喉
     */
    public OtolaryngologyLarynx getLarynx() {
        return this.Larynx;
    }

    /**
     * Set 喉
     * @param Larynx 喉
     */
    public void setLarynx(OtolaryngologyLarynx Larynx) {
        this.Larynx = Larynx;
    }

    /**
     * Get 耳鼻喉其他 
     * @return Others 耳鼻喉其他
     */
    public KeyValueItem [] getOthers() {
        return this.Others;
    }

    /**
     * Set 耳鼻喉其他
     * @param Others 耳鼻喉其他
     */
    public void setOthers(KeyValueItem [] Others) {
        this.Others = Others;
    }

    /**
     * Get 小结 
     * @return BriefSummary 小结
     */
    public OtolaryngologyBriefSummary getBriefSummary() {
        return this.BriefSummary;
    }

    /**
     * Set 小结
     * @param BriefSummary 小结
     */
    public void setBriefSummary(OtolaryngologyBriefSummary BriefSummary) {
        this.BriefSummary = BriefSummary;
    }

    public OtolaryngologyBaseItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OtolaryngologyBaseItem(OtolaryngologyBaseItem source) {
        if (source.Ear != null) {
            this.Ear = new OtolaryngologyEar(source.Ear);
        }
        if (source.Nose != null) {
            this.Nose = new OtolaryngologyNose(source.Nose);
        }
        if (source.Larynx != null) {
            this.Larynx = new OtolaryngologyLarynx(source.Larynx);
        }
        if (source.Others != null) {
            this.Others = new KeyValueItem[source.Others.length];
            for (int i = 0; i < source.Others.length; i++) {
                this.Others[i] = new KeyValueItem(source.Others[i]);
            }
        }
        if (source.BriefSummary != null) {
            this.BriefSummary = new OtolaryngologyBriefSummary(source.BriefSummary);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Ear.", this.Ear);
        this.setParamObj(map, prefix + "Nose.", this.Nose);
        this.setParamObj(map, prefix + "Larynx.", this.Larynx);
        this.setParamArrayObj(map, prefix + "Others.", this.Others);
        this.setParamObj(map, prefix + "BriefSummary.", this.BriefSummary);

    }
}

