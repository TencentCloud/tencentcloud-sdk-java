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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LabelRef extends AbstractModel {

    /**
    * <p>标签 ID</p>
    */
    @SerializedName("LabelId")
    @Expose
    private String LabelId;

    /**
    * <p>标签名称</p>
    */
    @SerializedName("LabelName")
    @Expose
    private String LabelName;

    /**
    * <p>标签标准词 ID 列表</p>
    */
    @SerializedName("LabelTermIdList")
    @Expose
    private String [] LabelTermIdList;

    /**
    * <p>标签标准词列表</p>
    */
    @SerializedName("LabelTermList")
    @Expose
    private String [] LabelTermList;

    /**
     * Get <p>标签 ID</p> 
     * @return LabelId <p>标签 ID</p>
     */
    public String getLabelId() {
        return this.LabelId;
    }

    /**
     * Set <p>标签 ID</p>
     * @param LabelId <p>标签 ID</p>
     */
    public void setLabelId(String LabelId) {
        this.LabelId = LabelId;
    }

    /**
     * Get <p>标签名称</p> 
     * @return LabelName <p>标签名称</p>
     */
    public String getLabelName() {
        return this.LabelName;
    }

    /**
     * Set <p>标签名称</p>
     * @param LabelName <p>标签名称</p>
     */
    public void setLabelName(String LabelName) {
        this.LabelName = LabelName;
    }

    /**
     * Get <p>标签标准词 ID 列表</p> 
     * @return LabelTermIdList <p>标签标准词 ID 列表</p>
     */
    public String [] getLabelTermIdList() {
        return this.LabelTermIdList;
    }

    /**
     * Set <p>标签标准词 ID 列表</p>
     * @param LabelTermIdList <p>标签标准词 ID 列表</p>
     */
    public void setLabelTermIdList(String [] LabelTermIdList) {
        this.LabelTermIdList = LabelTermIdList;
    }

    /**
     * Get <p>标签标准词列表</p> 
     * @return LabelTermList <p>标签标准词列表</p>
     */
    public String [] getLabelTermList() {
        return this.LabelTermList;
    }

    /**
     * Set <p>标签标准词列表</p>
     * @param LabelTermList <p>标签标准词列表</p>
     */
    public void setLabelTermList(String [] LabelTermList) {
        this.LabelTermList = LabelTermList;
    }

    public LabelRef() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LabelRef(LabelRef source) {
        if (source.LabelId != null) {
            this.LabelId = new String(source.LabelId);
        }
        if (source.LabelName != null) {
            this.LabelName = new String(source.LabelName);
        }
        if (source.LabelTermIdList != null) {
            this.LabelTermIdList = new String[source.LabelTermIdList.length];
            for (int i = 0; i < source.LabelTermIdList.length; i++) {
                this.LabelTermIdList[i] = new String(source.LabelTermIdList[i]);
            }
        }
        if (source.LabelTermList != null) {
            this.LabelTermList = new String[source.LabelTermList.length];
            for (int i = 0; i < source.LabelTermList.length; i++) {
                this.LabelTermList[i] = new String(source.LabelTermList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LabelId", this.LabelId);
        this.setParamSimple(map, prefix + "LabelName", this.LabelName);
        this.setParamArraySimple(map, prefix + "LabelTermIdList.", this.LabelTermIdList);
        this.setParamArraySimple(map, prefix + "LabelTermList.", this.LabelTermList);

    }
}

