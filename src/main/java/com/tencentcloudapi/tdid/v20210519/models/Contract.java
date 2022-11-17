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
package com.tencentcloudapi.tdid.v20210519.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Contract extends AbstractModel{

    /**
    * 应用名
    */
    @SerializedName("ApplyName")
    @Expose
    private String ApplyName;

    /**
    * 合约状态 true:已启用 false:未启用
    */
    @SerializedName("Enable")
    @Expose
    private Boolean Enable;

    /**
    * 合约CNS地址
    */
    @SerializedName("Hash")
    @Expose
    private String Hash;

    /**
    * 合约CNS地址脱敏
    */
    @SerializedName("HashShow")
    @Expose
    private String HashShow;

    /**
    * 部署机构DID
    */
    @SerializedName("WeId")
    @Expose
    private String WeId;

    /**
    * 部署机构名称
    */
    @SerializedName("DeployName")
    @Expose
    private String DeployName;

    /**
    * 部署群组
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 部署时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
     * Get 应用名 
     * @return ApplyName 应用名
     */
    public String getApplyName() {
        return this.ApplyName;
    }

    /**
     * Set 应用名
     * @param ApplyName 应用名
     */
    public void setApplyName(String ApplyName) {
        this.ApplyName = ApplyName;
    }

    /**
     * Get 合约状态 true:已启用 false:未启用 
     * @return Enable 合约状态 true:已启用 false:未启用
     */
    public Boolean getEnable() {
        return this.Enable;
    }

    /**
     * Set 合约状态 true:已启用 false:未启用
     * @param Enable 合约状态 true:已启用 false:未启用
     */
    public void setEnable(Boolean Enable) {
        this.Enable = Enable;
    }

    /**
     * Get 合约CNS地址 
     * @return Hash 合约CNS地址
     */
    public String getHash() {
        return this.Hash;
    }

    /**
     * Set 合约CNS地址
     * @param Hash 合约CNS地址
     */
    public void setHash(String Hash) {
        this.Hash = Hash;
    }

    /**
     * Get 合约CNS地址脱敏 
     * @return HashShow 合约CNS地址脱敏
     */
    public String getHashShow() {
        return this.HashShow;
    }

    /**
     * Set 合约CNS地址脱敏
     * @param HashShow 合约CNS地址脱敏
     */
    public void setHashShow(String HashShow) {
        this.HashShow = HashShow;
    }

    /**
     * Get 部署机构DID 
     * @return WeId 部署机构DID
     */
    public String getWeId() {
        return this.WeId;
    }

    /**
     * Set 部署机构DID
     * @param WeId 部署机构DID
     */
    public void setWeId(String WeId) {
        this.WeId = WeId;
    }

    /**
     * Get 部署机构名称 
     * @return DeployName 部署机构名称
     */
    public String getDeployName() {
        return this.DeployName;
    }

    /**
     * Set 部署机构名称
     * @param DeployName 部署机构名称
     */
    public void setDeployName(String DeployName) {
        this.DeployName = DeployName;
    }

    /**
     * Get 部署群组 
     * @return GroupId 部署群组
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 部署群组
     * @param GroupId 部署群组
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 部署时间 
     * @return CreateTime 部署时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 部署时间
     * @param CreateTime 部署时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    public Contract() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Contract(Contract source) {
        if (source.ApplyName != null) {
            this.ApplyName = new String(source.ApplyName);
        }
        if (source.Enable != null) {
            this.Enable = new Boolean(source.Enable);
        }
        if (source.Hash != null) {
            this.Hash = new String(source.Hash);
        }
        if (source.HashShow != null) {
            this.HashShow = new String(source.HashShow);
        }
        if (source.WeId != null) {
            this.WeId = new String(source.WeId);
        }
        if (source.DeployName != null) {
            this.DeployName = new String(source.DeployName);
        }
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApplyName", this.ApplyName);
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "Hash", this.Hash);
        this.setParamSimple(map, prefix + "HashShow", this.HashShow);
        this.setParamSimple(map, prefix + "WeId", this.WeId);
        this.setParamSimple(map, prefix + "DeployName", this.DeployName);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);

    }
}

