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
package com.tencentcloudapi.apcas.v20201127.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TaskDetailData extends AbstractModel{

    /**
    * 画像TAG ID
    */
    @SerializedName("TagId")
    @Expose
    private Long TagId;

    /**
    * 画像TAG描述（如“省份分布”）
    */
    @SerializedName("TagDesc")
    @Expose
    private String TagDesc;

    /**
    * 画像Label对象列表（一个TAG对于N个Label，例如“省份分布”TAG对应“广东省”、“浙江省”等多个Label）
    */
    @SerializedName("LabelDetailDataList")
    @Expose
    private LabelDetailData [] LabelDetailDataList;

    /**
     * Get 画像TAG ID 
     * @return TagId 画像TAG ID
     */
    public Long getTagId() {
        return this.TagId;
    }

    /**
     * Set 画像TAG ID
     * @param TagId 画像TAG ID
     */
    public void setTagId(Long TagId) {
        this.TagId = TagId;
    }

    /**
     * Get 画像TAG描述（如“省份分布”） 
     * @return TagDesc 画像TAG描述（如“省份分布”）
     */
    public String getTagDesc() {
        return this.TagDesc;
    }

    /**
     * Set 画像TAG描述（如“省份分布”）
     * @param TagDesc 画像TAG描述（如“省份分布”）
     */
    public void setTagDesc(String TagDesc) {
        this.TagDesc = TagDesc;
    }

    /**
     * Get 画像Label对象列表（一个TAG对于N个Label，例如“省份分布”TAG对应“广东省”、“浙江省”等多个Label） 
     * @return LabelDetailDataList 画像Label对象列表（一个TAG对于N个Label，例如“省份分布”TAG对应“广东省”、“浙江省”等多个Label）
     */
    public LabelDetailData [] getLabelDetailDataList() {
        return this.LabelDetailDataList;
    }

    /**
     * Set 画像Label对象列表（一个TAG对于N个Label，例如“省份分布”TAG对应“广东省”、“浙江省”等多个Label）
     * @param LabelDetailDataList 画像Label对象列表（一个TAG对于N个Label，例如“省份分布”TAG对应“广东省”、“浙江省”等多个Label）
     */
    public void setLabelDetailDataList(LabelDetailData [] LabelDetailDataList) {
        this.LabelDetailDataList = LabelDetailDataList;
    }

    public TaskDetailData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskDetailData(TaskDetailData source) {
        if (source.TagId != null) {
            this.TagId = new Long(source.TagId);
        }
        if (source.TagDesc != null) {
            this.TagDesc = new String(source.TagDesc);
        }
        if (source.LabelDetailDataList != null) {
            this.LabelDetailDataList = new LabelDetailData[source.LabelDetailDataList.length];
            for (int i = 0; i < source.LabelDetailDataList.length; i++) {
                this.LabelDetailDataList[i] = new LabelDetailData(source.LabelDetailDataList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TagId", this.TagId);
        this.setParamSimple(map, prefix + "TagDesc", this.TagDesc);
        this.setParamArrayObj(map, prefix + "LabelDetailDataList.", this.LabelDetailDataList);

    }
}

