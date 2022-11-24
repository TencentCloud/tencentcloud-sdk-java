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

public class ApplyChainMakerBatchUserCertRequest extends AbstractModel{

    /**
    * 网络ID，可在区块链网络详情或列表中获取
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 证书标识和证书请求文件，可参考TBaaS证书生成相关文档生成证书请求文件
    */
    @SerializedName("SignUserCsrList")
    @Expose
    private SignCertCsr [] SignUserCsrList;

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
     * Get 证书标识和证书请求文件，可参考TBaaS证书生成相关文档生成证书请求文件 
     * @return SignUserCsrList 证书标识和证书请求文件，可参考TBaaS证书生成相关文档生成证书请求文件
     */
    public SignCertCsr [] getSignUserCsrList() {
        return this.SignUserCsrList;
    }

    /**
     * Set 证书标识和证书请求文件，可参考TBaaS证书生成相关文档生成证书请求文件
     * @param SignUserCsrList 证书标识和证书请求文件，可参考TBaaS证书生成相关文档生成证书请求文件
     */
    public void setSignUserCsrList(SignCertCsr [] SignUserCsrList) {
        this.SignUserCsrList = SignUserCsrList;
    }

    public ApplyChainMakerBatchUserCertRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApplyChainMakerBatchUserCertRequest(ApplyChainMakerBatchUserCertRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.SignUserCsrList != null) {
            this.SignUserCsrList = new SignCertCsr[source.SignUserCsrList.length];
            for (int i = 0; i < source.SignUserCsrList.length; i++) {
                this.SignUserCsrList[i] = new SignCertCsr(source.SignUserCsrList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamArrayObj(map, prefix + "SignUserCsrList.", this.SignUserCsrList);

    }
}

