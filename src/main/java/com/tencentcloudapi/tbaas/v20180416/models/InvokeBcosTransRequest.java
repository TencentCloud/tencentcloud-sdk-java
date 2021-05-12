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
package com.tencentcloudapi.tbaas.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InvokeBcosTransRequest extends AbstractModel{

    /**
    * 网络ID，可在区块链网络详情或列表中获取
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 群组编号，可在群组列表中获取
    */
    @SerializedName("GroupId")
    @Expose
    private Long GroupId;

    /**
    * 合约地址，可在合约详情获取
    */
    @SerializedName("ContractAddress")
    @Expose
    private String ContractAddress;

    /**
    * 合约Abi的json数组格式的字符串，可在合约详情获取
    */
    @SerializedName("AbiInfo")
    @Expose
    private String AbiInfo;

    /**
    * 合约方法名
    */
    @SerializedName("FuncName")
    @Expose
    private String FuncName;

    /**
    * 签名用户编号，可在私钥管理页面获取
    */
    @SerializedName("SignUserId")
    @Expose
    private String SignUserId;

    /**
    * 合约方法入参，json格式字符串
    */
    @SerializedName("FuncParam")
    @Expose
    private String FuncParam;

    /**
     * Get 网络ID，可在区块链网络详情或列表中获取 
     * @return ClusterId 网络ID，可在区块链网络详情或列表中获取
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 网络ID，可在区块链网络详情或列表中获取
     * @param ClusterId 网络ID，可在区块链网络详情或列表中获取
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 群组编号，可在群组列表中获取 
     * @return GroupId 群组编号，可在群组列表中获取
     */
    public Long getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 群组编号，可在群组列表中获取
     * @param GroupId 群组编号，可在群组列表中获取
     */
    public void setGroupId(Long GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 合约地址，可在合约详情获取 
     * @return ContractAddress 合约地址，可在合约详情获取
     */
    public String getContractAddress() {
        return this.ContractAddress;
    }

    /**
     * Set 合约地址，可在合约详情获取
     * @param ContractAddress 合约地址，可在合约详情获取
     */
    public void setContractAddress(String ContractAddress) {
        this.ContractAddress = ContractAddress;
    }

    /**
     * Get 合约Abi的json数组格式的字符串，可在合约详情获取 
     * @return AbiInfo 合约Abi的json数组格式的字符串，可在合约详情获取
     */
    public String getAbiInfo() {
        return this.AbiInfo;
    }

    /**
     * Set 合约Abi的json数组格式的字符串，可在合约详情获取
     * @param AbiInfo 合约Abi的json数组格式的字符串，可在合约详情获取
     */
    public void setAbiInfo(String AbiInfo) {
        this.AbiInfo = AbiInfo;
    }

    /**
     * Get 合约方法名 
     * @return FuncName 合约方法名
     */
    public String getFuncName() {
        return this.FuncName;
    }

    /**
     * Set 合约方法名
     * @param FuncName 合约方法名
     */
    public void setFuncName(String FuncName) {
        this.FuncName = FuncName;
    }

    /**
     * Get 签名用户编号，可在私钥管理页面获取 
     * @return SignUserId 签名用户编号，可在私钥管理页面获取
     */
    public String getSignUserId() {
        return this.SignUserId;
    }

    /**
     * Set 签名用户编号，可在私钥管理页面获取
     * @param SignUserId 签名用户编号，可在私钥管理页面获取
     */
    public void setSignUserId(String SignUserId) {
        this.SignUserId = SignUserId;
    }

    /**
     * Get 合约方法入参，json格式字符串 
     * @return FuncParam 合约方法入参，json格式字符串
     */
    public String getFuncParam() {
        return this.FuncParam;
    }

    /**
     * Set 合约方法入参，json格式字符串
     * @param FuncParam 合约方法入参，json格式字符串
     */
    public void setFuncParam(String FuncParam) {
        this.FuncParam = FuncParam;
    }

    public InvokeBcosTransRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InvokeBcosTransRequest(InvokeBcosTransRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.GroupId != null) {
            this.GroupId = new Long(source.GroupId);
        }
        if (source.ContractAddress != null) {
            this.ContractAddress = new String(source.ContractAddress);
        }
        if (source.AbiInfo != null) {
            this.AbiInfo = new String(source.AbiInfo);
        }
        if (source.FuncName != null) {
            this.FuncName = new String(source.FuncName);
        }
        if (source.SignUserId != null) {
            this.SignUserId = new String(source.SignUserId);
        }
        if (source.FuncParam != null) {
            this.FuncParam = new String(source.FuncParam);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "ContractAddress", this.ContractAddress);
        this.setParamSimple(map, prefix + "AbiInfo", this.AbiInfo);
        this.setParamSimple(map, prefix + "FuncName", this.FuncName);
        this.setParamSimple(map, prefix + "SignUserId", this.SignUserId);
        this.setParamSimple(map, prefix + "FuncParam", this.FuncParam);

    }
}

