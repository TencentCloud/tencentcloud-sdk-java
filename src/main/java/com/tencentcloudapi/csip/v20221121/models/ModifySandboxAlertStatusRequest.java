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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifySandboxAlertStatusRequest extends AbstractModel {

    /**
    * 告警类型
枚举值：
ACL：访问控制
DLP：数据泄露防护
LLM_AUDIT：LLM 审计
    */
    @SerializedName("AlertType")
    @Expose
    private String AlertType;

    /**
    * 归属资产类型
枚举值：
HOST：主机
CONTAINER：容器
    */
    @SerializedName("BelongAssetType")
    @Expose
    private String BelongAssetType;

    /**
    * 告警记录 ID 列表
入参限制：非空，长度 1-100，去重后生效
    */
    @SerializedName("IDList")
    @Expose
    private Long [] IDList;

    /**
    * 目标操作
枚举值：
HANDLED：已处理
IGNORE：已忽略
PASS：已加白
DELETE：删除（不可恢复）
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get 告警类型
枚举值：
ACL：访问控制
DLP：数据泄露防护
LLM_AUDIT：LLM 审计 
     * @return AlertType 告警类型
枚举值：
ACL：访问控制
DLP：数据泄露防护
LLM_AUDIT：LLM 审计
     */
    public String getAlertType() {
        return this.AlertType;
    }

    /**
     * Set 告警类型
枚举值：
ACL：访问控制
DLP：数据泄露防护
LLM_AUDIT：LLM 审计
     * @param AlertType 告警类型
枚举值：
ACL：访问控制
DLP：数据泄露防护
LLM_AUDIT：LLM 审计
     */
    public void setAlertType(String AlertType) {
        this.AlertType = AlertType;
    }

    /**
     * Get 归属资产类型
枚举值：
HOST：主机
CONTAINER：容器 
     * @return BelongAssetType 归属资产类型
枚举值：
HOST：主机
CONTAINER：容器
     */
    public String getBelongAssetType() {
        return this.BelongAssetType;
    }

    /**
     * Set 归属资产类型
枚举值：
HOST：主机
CONTAINER：容器
     * @param BelongAssetType 归属资产类型
枚举值：
HOST：主机
CONTAINER：容器
     */
    public void setBelongAssetType(String BelongAssetType) {
        this.BelongAssetType = BelongAssetType;
    }

    /**
     * Get 告警记录 ID 列表
入参限制：非空，长度 1-100，去重后生效 
     * @return IDList 告警记录 ID 列表
入参限制：非空，长度 1-100，去重后生效
     */
    public Long [] getIDList() {
        return this.IDList;
    }

    /**
     * Set 告警记录 ID 列表
入参限制：非空，长度 1-100，去重后生效
     * @param IDList 告警记录 ID 列表
入参限制：非空，长度 1-100，去重后生效
     */
    public void setIDList(Long [] IDList) {
        this.IDList = IDList;
    }

    /**
     * Get 目标操作
枚举值：
HANDLED：已处理
IGNORE：已忽略
PASS：已加白
DELETE：删除（不可恢复） 
     * @return Status 目标操作
枚举值：
HANDLED：已处理
IGNORE：已忽略
PASS：已加白
DELETE：删除（不可恢复）
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 目标操作
枚举值：
HANDLED：已处理
IGNORE：已忽略
PASS：已加白
DELETE：删除（不可恢复）
     * @param Status 目标操作
枚举值：
HANDLED：已处理
IGNORE：已忽略
PASS：已加白
DELETE：删除（不可恢复）
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    public ModifySandboxAlertStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifySandboxAlertStatusRequest(ModifySandboxAlertStatusRequest source) {
        if (source.AlertType != null) {
            this.AlertType = new String(source.AlertType);
        }
        if (source.BelongAssetType != null) {
            this.BelongAssetType = new String(source.BelongAssetType);
        }
        if (source.IDList != null) {
            this.IDList = new Long[source.IDList.length];
            for (int i = 0; i < source.IDList.length; i++) {
                this.IDList[i] = new Long(source.IDList[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AlertType", this.AlertType);
        this.setParamSimple(map, prefix + "BelongAssetType", this.BelongAssetType);
        this.setParamArraySimple(map, prefix + "IDList.", this.IDList);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

