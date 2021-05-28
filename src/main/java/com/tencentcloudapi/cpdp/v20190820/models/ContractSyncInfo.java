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
package com.tencentcloudapi.cpdp.v20190820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ContractSyncInfo extends AbstractModel{

    /**
    * 第三方渠道合约信息
    */
    @SerializedName("ExternalReturnContractInfo")
    @Expose
    private ExternalReturnContractInfo ExternalReturnContractInfo;

    /**
    * 第三方渠道用户信息
    */
    @SerializedName("ExternalContractUserInfo")
    @Expose
    private ExternalContractUserInfo [] ExternalContractUserInfo;

    /**
    * 签约方式，枚举值，
<br/>CONTRACT_METHOD_WECHAT_INVALID: 无效
CONTRACT_METHOD_WECHAT_APP: 微信APP
CONTRACT_METHOD_WECHAT_PUBLIC: 微信公众号
CONTRACT_METHOD_WECHAT_MINIPROGRAM: 微信小程序
CONTRACT_METHOD_WECHAT_H5: 微信H5
    */
    @SerializedName("ContractMethod")
    @Expose
    private String ContractMethod;

    /**
    * 在米大师侧分配的场景id
    */
    @SerializedName("ContractSceneId")
    @Expose
    private String ContractSceneId;

    /**
    * 调用方从第三方渠道查询到的签约数据，由各个渠道定义
    */
    @SerializedName("ExternalReturnContractData")
    @Expose
    private String ExternalReturnContractData;

    /**
     * Get 第三方渠道合约信息 
     * @return ExternalReturnContractInfo 第三方渠道合约信息
     */
    public ExternalReturnContractInfo getExternalReturnContractInfo() {
        return this.ExternalReturnContractInfo;
    }

    /**
     * Set 第三方渠道合约信息
     * @param ExternalReturnContractInfo 第三方渠道合约信息
     */
    public void setExternalReturnContractInfo(ExternalReturnContractInfo ExternalReturnContractInfo) {
        this.ExternalReturnContractInfo = ExternalReturnContractInfo;
    }

    /**
     * Get 第三方渠道用户信息 
     * @return ExternalContractUserInfo 第三方渠道用户信息
     */
    public ExternalContractUserInfo [] getExternalContractUserInfo() {
        return this.ExternalContractUserInfo;
    }

    /**
     * Set 第三方渠道用户信息
     * @param ExternalContractUserInfo 第三方渠道用户信息
     */
    public void setExternalContractUserInfo(ExternalContractUserInfo [] ExternalContractUserInfo) {
        this.ExternalContractUserInfo = ExternalContractUserInfo;
    }

    /**
     * Get 签约方式，枚举值，
<br/>CONTRACT_METHOD_WECHAT_INVALID: 无效
CONTRACT_METHOD_WECHAT_APP: 微信APP
CONTRACT_METHOD_WECHAT_PUBLIC: 微信公众号
CONTRACT_METHOD_WECHAT_MINIPROGRAM: 微信小程序
CONTRACT_METHOD_WECHAT_H5: 微信H5 
     * @return ContractMethod 签约方式，枚举值，
<br/>CONTRACT_METHOD_WECHAT_INVALID: 无效
CONTRACT_METHOD_WECHAT_APP: 微信APP
CONTRACT_METHOD_WECHAT_PUBLIC: 微信公众号
CONTRACT_METHOD_WECHAT_MINIPROGRAM: 微信小程序
CONTRACT_METHOD_WECHAT_H5: 微信H5
     */
    public String getContractMethod() {
        return this.ContractMethod;
    }

    /**
     * Set 签约方式，枚举值，
<br/>CONTRACT_METHOD_WECHAT_INVALID: 无效
CONTRACT_METHOD_WECHAT_APP: 微信APP
CONTRACT_METHOD_WECHAT_PUBLIC: 微信公众号
CONTRACT_METHOD_WECHAT_MINIPROGRAM: 微信小程序
CONTRACT_METHOD_WECHAT_H5: 微信H5
     * @param ContractMethod 签约方式，枚举值，
<br/>CONTRACT_METHOD_WECHAT_INVALID: 无效
CONTRACT_METHOD_WECHAT_APP: 微信APP
CONTRACT_METHOD_WECHAT_PUBLIC: 微信公众号
CONTRACT_METHOD_WECHAT_MINIPROGRAM: 微信小程序
CONTRACT_METHOD_WECHAT_H5: 微信H5
     */
    public void setContractMethod(String ContractMethod) {
        this.ContractMethod = ContractMethod;
    }

    /**
     * Get 在米大师侧分配的场景id 
     * @return ContractSceneId 在米大师侧分配的场景id
     */
    public String getContractSceneId() {
        return this.ContractSceneId;
    }

    /**
     * Set 在米大师侧分配的场景id
     * @param ContractSceneId 在米大师侧分配的场景id
     */
    public void setContractSceneId(String ContractSceneId) {
        this.ContractSceneId = ContractSceneId;
    }

    /**
     * Get 调用方从第三方渠道查询到的签约数据，由各个渠道定义 
     * @return ExternalReturnContractData 调用方从第三方渠道查询到的签约数据，由各个渠道定义
     */
    public String getExternalReturnContractData() {
        return this.ExternalReturnContractData;
    }

    /**
     * Set 调用方从第三方渠道查询到的签约数据，由各个渠道定义
     * @param ExternalReturnContractData 调用方从第三方渠道查询到的签约数据，由各个渠道定义
     */
    public void setExternalReturnContractData(String ExternalReturnContractData) {
        this.ExternalReturnContractData = ExternalReturnContractData;
    }

    public ContractSyncInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ContractSyncInfo(ContractSyncInfo source) {
        if (source.ExternalReturnContractInfo != null) {
            this.ExternalReturnContractInfo = new ExternalReturnContractInfo(source.ExternalReturnContractInfo);
        }
        if (source.ExternalContractUserInfo != null) {
            this.ExternalContractUserInfo = new ExternalContractUserInfo[source.ExternalContractUserInfo.length];
            for (int i = 0; i < source.ExternalContractUserInfo.length; i++) {
                this.ExternalContractUserInfo[i] = new ExternalContractUserInfo(source.ExternalContractUserInfo[i]);
            }
        }
        if (source.ContractMethod != null) {
            this.ContractMethod = new String(source.ContractMethod);
        }
        if (source.ContractSceneId != null) {
            this.ContractSceneId = new String(source.ContractSceneId);
        }
        if (source.ExternalReturnContractData != null) {
            this.ExternalReturnContractData = new String(source.ExternalReturnContractData);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "ExternalReturnContractInfo.", this.ExternalReturnContractInfo);
        this.setParamArrayObj(map, prefix + "ExternalContractUserInfo.", this.ExternalContractUserInfo);
        this.setParamSimple(map, prefix + "ContractMethod", this.ContractMethod);
        this.setParamSimple(map, prefix + "ContractSceneId", this.ContractSceneId);
        this.setParamSimple(map, prefix + "ExternalReturnContractData", this.ExternalReturnContractData);

    }
}

