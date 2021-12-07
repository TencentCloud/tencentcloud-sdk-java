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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ClusterRiskItem extends AbstractModel{

    /**
    * 检测项相关信息
    */
    @SerializedName("CheckItem")
    @Expose
    private ClusterCheckItem CheckItem;

    /**
    * 验证信息
    */
    @SerializedName("VerifyInfo")
    @Expose
    private String VerifyInfo;

    /**
    * 事件描述,检查的错误信息
    */
    @SerializedName("ErrorMessage")
    @Expose
    private String ErrorMessage;

    /**
    * 受影响的集群数量
    */
    @SerializedName("AffectedClusterCount")
    @Expose
    private Long AffectedClusterCount;

    /**
    * 受影响的节点数量
    */
    @SerializedName("AffectedNodeCount")
    @Expose
    private Long AffectedNodeCount;

    /**
     * Get 检测项相关信息 
     * @return CheckItem 检测项相关信息
     */
    public ClusterCheckItem getCheckItem() {
        return this.CheckItem;
    }

    /**
     * Set 检测项相关信息
     * @param CheckItem 检测项相关信息
     */
    public void setCheckItem(ClusterCheckItem CheckItem) {
        this.CheckItem = CheckItem;
    }

    /**
     * Get 验证信息 
     * @return VerifyInfo 验证信息
     */
    public String getVerifyInfo() {
        return this.VerifyInfo;
    }

    /**
     * Set 验证信息
     * @param VerifyInfo 验证信息
     */
    public void setVerifyInfo(String VerifyInfo) {
        this.VerifyInfo = VerifyInfo;
    }

    /**
     * Get 事件描述,检查的错误信息 
     * @return ErrorMessage 事件描述,检查的错误信息
     */
    public String getErrorMessage() {
        return this.ErrorMessage;
    }

    /**
     * Set 事件描述,检查的错误信息
     * @param ErrorMessage 事件描述,检查的错误信息
     */
    public void setErrorMessage(String ErrorMessage) {
        this.ErrorMessage = ErrorMessage;
    }

    /**
     * Get 受影响的集群数量 
     * @return AffectedClusterCount 受影响的集群数量
     */
    public Long getAffectedClusterCount() {
        return this.AffectedClusterCount;
    }

    /**
     * Set 受影响的集群数量
     * @param AffectedClusterCount 受影响的集群数量
     */
    public void setAffectedClusterCount(Long AffectedClusterCount) {
        this.AffectedClusterCount = AffectedClusterCount;
    }

    /**
     * Get 受影响的节点数量 
     * @return AffectedNodeCount 受影响的节点数量
     */
    public Long getAffectedNodeCount() {
        return this.AffectedNodeCount;
    }

    /**
     * Set 受影响的节点数量
     * @param AffectedNodeCount 受影响的节点数量
     */
    public void setAffectedNodeCount(Long AffectedNodeCount) {
        this.AffectedNodeCount = AffectedNodeCount;
    }

    public ClusterRiskItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClusterRiskItem(ClusterRiskItem source) {
        if (source.CheckItem != null) {
            this.CheckItem = new ClusterCheckItem(source.CheckItem);
        }
        if (source.VerifyInfo != null) {
            this.VerifyInfo = new String(source.VerifyInfo);
        }
        if (source.ErrorMessage != null) {
            this.ErrorMessage = new String(source.ErrorMessage);
        }
        if (source.AffectedClusterCount != null) {
            this.AffectedClusterCount = new Long(source.AffectedClusterCount);
        }
        if (source.AffectedNodeCount != null) {
            this.AffectedNodeCount = new Long(source.AffectedNodeCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "CheckItem.", this.CheckItem);
        this.setParamSimple(map, prefix + "VerifyInfo", this.VerifyInfo);
        this.setParamSimple(map, prefix + "ErrorMessage", this.ErrorMessage);
        this.setParamSimple(map, prefix + "AffectedClusterCount", this.AffectedClusterCount);
        this.setParamSimple(map, prefix + "AffectedNodeCount", this.AffectedNodeCount);

    }
}

