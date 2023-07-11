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
package com.tencentcloudapi.cms.v20190321.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteLibSamplesRequest extends AbstractModel{

    /**
    * 关键词ID列表
    */
    @SerializedName("SampleIDs")
    @Expose
    private String [] SampleIDs;

    /**
    * 词库ID
    */
    @SerializedName("LibID")
    @Expose
    private String LibID;

    /**
    * 关键词内容列表
    */
    @SerializedName("SampleContents")
    @Expose
    private String [] SampleContents;

    /**
     * Get 关键词ID列表 
     * @return SampleIDs 关键词ID列表
     */
    public String [] getSampleIDs() {
        return this.SampleIDs;
    }

    /**
     * Set 关键词ID列表
     * @param SampleIDs 关键词ID列表
     */
    public void setSampleIDs(String [] SampleIDs) {
        this.SampleIDs = SampleIDs;
    }

    /**
     * Get 词库ID 
     * @return LibID 词库ID
     */
    public String getLibID() {
        return this.LibID;
    }

    /**
     * Set 词库ID
     * @param LibID 词库ID
     */
    public void setLibID(String LibID) {
        this.LibID = LibID;
    }

    /**
     * Get 关键词内容列表 
     * @return SampleContents 关键词内容列表
     */
    public String [] getSampleContents() {
        return this.SampleContents;
    }

    /**
     * Set 关键词内容列表
     * @param SampleContents 关键词内容列表
     */
    public void setSampleContents(String [] SampleContents) {
        this.SampleContents = SampleContents;
    }

    public DeleteLibSamplesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteLibSamplesRequest(DeleteLibSamplesRequest source) {
        if (source.SampleIDs != null) {
            this.SampleIDs = new String[source.SampleIDs.length];
            for (int i = 0; i < source.SampleIDs.length; i++) {
                this.SampleIDs[i] = new String(source.SampleIDs[i]);
            }
        }
        if (source.LibID != null) {
            this.LibID = new String(source.LibID);
        }
        if (source.SampleContents != null) {
            this.SampleContents = new String[source.SampleContents.length];
            for (int i = 0; i < source.SampleContents.length; i++) {
                this.SampleContents[i] = new String(source.SampleContents[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "SampleIDs.", this.SampleIDs);
        this.setParamSimple(map, prefix + "LibID", this.LibID);
        this.setParamArraySimple(map, prefix + "SampleContents.", this.SampleContents);

    }
}

