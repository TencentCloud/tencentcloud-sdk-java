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
package com.tencentcloudapi.tdmysql.v20211122.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AnalysisRelationInfo extends AbstractModel {

    /**
    * <p>源实例Id</p>
    */
    @SerializedName("PrimaryInstanceId")
    @Expose
    private String PrimaryInstanceId;

    /**
    * <p>分析引擎实例Id</p>
    */
    @SerializedName("AnalysisInstanceId")
    @Expose
    private String AnalysisInstanceId;

    /**
    * <p>分析引擎关系状态</p><p>枚举值：</p><ul><li>creating： 创建中</li><li>running： 运行中</li><li>destroyed： 已销毁</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>创建时间</p>
    */
    @SerializedName("CreateAt")
    @Expose
    private String CreateAt;

    /**
    * <p>更新时间</p>
    */
    @SerializedName("UpdateAt")
    @Expose
    private String UpdateAt;

    /**
     * Get <p>源实例Id</p> 
     * @return PrimaryInstanceId <p>源实例Id</p>
     */
    public String getPrimaryInstanceId() {
        return this.PrimaryInstanceId;
    }

    /**
     * Set <p>源实例Id</p>
     * @param PrimaryInstanceId <p>源实例Id</p>
     */
    public void setPrimaryInstanceId(String PrimaryInstanceId) {
        this.PrimaryInstanceId = PrimaryInstanceId;
    }

    /**
     * Get <p>分析引擎实例Id</p> 
     * @return AnalysisInstanceId <p>分析引擎实例Id</p>
     */
    public String getAnalysisInstanceId() {
        return this.AnalysisInstanceId;
    }

    /**
     * Set <p>分析引擎实例Id</p>
     * @param AnalysisInstanceId <p>分析引擎实例Id</p>
     */
    public void setAnalysisInstanceId(String AnalysisInstanceId) {
        this.AnalysisInstanceId = AnalysisInstanceId;
    }

    /**
     * Get <p>分析引擎关系状态</p><p>枚举值：</p><ul><li>creating： 创建中</li><li>running： 运行中</li><li>destroyed： 已销毁</li></ul> 
     * @return Status <p>分析引擎关系状态</p><p>枚举值：</p><ul><li>creating： 创建中</li><li>running： 运行中</li><li>destroyed： 已销毁</li></ul>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>分析引擎关系状态</p><p>枚举值：</p><ul><li>creating： 创建中</li><li>running： 运行中</li><li>destroyed： 已销毁</li></ul>
     * @param Status <p>分析引擎关系状态</p><p>枚举值：</p><ul><li>creating： 创建中</li><li>running： 运行中</li><li>destroyed： 已销毁</li></ul>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>创建时间</p> 
     * @return CreateAt <p>创建时间</p>
     */
    public String getCreateAt() {
        return this.CreateAt;
    }

    /**
     * Set <p>创建时间</p>
     * @param CreateAt <p>创建时间</p>
     */
    public void setCreateAt(String CreateAt) {
        this.CreateAt = CreateAt;
    }

    /**
     * Get <p>更新时间</p> 
     * @return UpdateAt <p>更新时间</p>
     */
    public String getUpdateAt() {
        return this.UpdateAt;
    }

    /**
     * Set <p>更新时间</p>
     * @param UpdateAt <p>更新时间</p>
     */
    public void setUpdateAt(String UpdateAt) {
        this.UpdateAt = UpdateAt;
    }

    public AnalysisRelationInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AnalysisRelationInfo(AnalysisRelationInfo source) {
        if (source.PrimaryInstanceId != null) {
            this.PrimaryInstanceId = new String(source.PrimaryInstanceId);
        }
        if (source.AnalysisInstanceId != null) {
            this.AnalysisInstanceId = new String(source.AnalysisInstanceId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.CreateAt != null) {
            this.CreateAt = new String(source.CreateAt);
        }
        if (source.UpdateAt != null) {
            this.UpdateAt = new String(source.UpdateAt);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PrimaryInstanceId", this.PrimaryInstanceId);
        this.setParamSimple(map, prefix + "AnalysisInstanceId", this.AnalysisInstanceId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreateAt", this.CreateAt);
        this.setParamSimple(map, prefix + "UpdateAt", this.UpdateAt);

    }
}

