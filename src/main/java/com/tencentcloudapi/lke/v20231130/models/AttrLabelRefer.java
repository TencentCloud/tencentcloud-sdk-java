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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AttrLabelRefer extends AbstractModel {

    /**
    * 标签来源，1：标签
    */
    @SerializedName("Source")
    @Expose
    private Long Source;

    /**
    * 标签ID
    */
    @SerializedName("AttributeBizId")
    @Expose
    private String AttributeBizId;

    /**
    * 标签值ID
    */
    @SerializedName("LabelBizIds")
    @Expose
    private String [] LabelBizIds;

    /**
     * Get 标签来源，1：标签 
     * @return Source 标签来源，1：标签
     */
    public Long getSource() {
        return this.Source;
    }

    /**
     * Set 标签来源，1：标签
     * @param Source 标签来源，1：标签
     */
    public void setSource(Long Source) {
        this.Source = Source;
    }

    /**
     * Get 标签ID 
     * @return AttributeBizId 标签ID
     */
    public String getAttributeBizId() {
        return this.AttributeBizId;
    }

    /**
     * Set 标签ID
     * @param AttributeBizId 标签ID
     */
    public void setAttributeBizId(String AttributeBizId) {
        this.AttributeBizId = AttributeBizId;
    }

    /**
     * Get 标签值ID 
     * @return LabelBizIds 标签值ID
     */
    public String [] getLabelBizIds() {
        return this.LabelBizIds;
    }

    /**
     * Set 标签值ID
     * @param LabelBizIds 标签值ID
     */
    public void setLabelBizIds(String [] LabelBizIds) {
        this.LabelBizIds = LabelBizIds;
    }

    public AttrLabelRefer() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AttrLabelRefer(AttrLabelRefer source) {
        if (source.Source != null) {
            this.Source = new Long(source.Source);
        }
        if (source.AttributeBizId != null) {
            this.AttributeBizId = new String(source.AttributeBizId);
        }
        if (source.LabelBizIds != null) {
            this.LabelBizIds = new String[source.LabelBizIds.length];
            for (int i = 0; i < source.LabelBizIds.length; i++) {
                this.LabelBizIds[i] = new String(source.LabelBizIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "AttributeBizId", this.AttributeBizId);
        this.setParamArraySimple(map, prefix + "LabelBizIds.", this.LabelBizIds);

    }
}

