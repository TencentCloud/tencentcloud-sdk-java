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

public class DeployDynamicBcosContractRequest extends AbstractModel{

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
    * 合约编译后的ABI，可在合约详情获取
    */
    @SerializedName("AbiInfo")
    @Expose
    private String AbiInfo;

    /**
    * 合约编译得到的字节码，hex编码，可在合约详情获取
    */
    @SerializedName("ByteCodeBin")
    @Expose
    private String ByteCodeBin;

    /**
    * 签名用户编号，可在私钥管理页面获取
    */
    @SerializedName("SignUserId")
    @Expose
    private String SignUserId;

    /**
    * 构造函数入参，Json数组，多个参数以逗号分隔（参数为数组时同理），如：["str1",["arr1","arr2"]]
    */
    @SerializedName("ConstructorParams")
    @Expose
    private String ConstructorParams;

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
     * Get 合约编译后的ABI，可在合约详情获取 
     * @return AbiInfo 合约编译后的ABI，可在合约详情获取
     */
    public String getAbiInfo() {
        return this.AbiInfo;
    }

    /**
     * Set 合约编译后的ABI，可在合约详情获取
     * @param AbiInfo 合约编译后的ABI，可在合约详情获取
     */
    public void setAbiInfo(String AbiInfo) {
        this.AbiInfo = AbiInfo;
    }

    /**
     * Get 合约编译得到的字节码，hex编码，可在合约详情获取 
     * @return ByteCodeBin 合约编译得到的字节码，hex编码，可在合约详情获取
     */
    public String getByteCodeBin() {
        return this.ByteCodeBin;
    }

    /**
     * Set 合约编译得到的字节码，hex编码，可在合约详情获取
     * @param ByteCodeBin 合约编译得到的字节码，hex编码，可在合约详情获取
     */
    public void setByteCodeBin(String ByteCodeBin) {
        this.ByteCodeBin = ByteCodeBin;
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
     * Get 构造函数入参，Json数组，多个参数以逗号分隔（参数为数组时同理），如：["str1",["arr1","arr2"]] 
     * @return ConstructorParams 构造函数入参，Json数组，多个参数以逗号分隔（参数为数组时同理），如：["str1",["arr1","arr2"]]
     */
    public String getConstructorParams() {
        return this.ConstructorParams;
    }

    /**
     * Set 构造函数入参，Json数组，多个参数以逗号分隔（参数为数组时同理），如：["str1",["arr1","arr2"]]
     * @param ConstructorParams 构造函数入参，Json数组，多个参数以逗号分隔（参数为数组时同理），如：["str1",["arr1","arr2"]]
     */
    public void setConstructorParams(String ConstructorParams) {
        this.ConstructorParams = ConstructorParams;
    }

    public DeployDynamicBcosContractRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeployDynamicBcosContractRequest(DeployDynamicBcosContractRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.GroupId != null) {
            this.GroupId = new Long(source.GroupId);
        }
        if (source.AbiInfo != null) {
            this.AbiInfo = new String(source.AbiInfo);
        }
        if (source.ByteCodeBin != null) {
            this.ByteCodeBin = new String(source.ByteCodeBin);
        }
        if (source.SignUserId != null) {
            this.SignUserId = new String(source.SignUserId);
        }
        if (source.ConstructorParams != null) {
            this.ConstructorParams = new String(source.ConstructorParams);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "AbiInfo", this.AbiInfo);
        this.setParamSimple(map, prefix + "ByteCodeBin", this.ByteCodeBin);
        this.setParamSimple(map, prefix + "SignUserId", this.SignUserId);
        this.setParamSimple(map, prefix + "ConstructorParams", this.ConstructorParams);

    }
}

