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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QueryFabricChaincodeRequest extends AbstractModel {

    /**
    * 网络ID，可在区块链网络详情获取
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 通道ID，可在通道列表或通道详情获取
    */
    @SerializedName("ChannelId")
    @Expose
    private String ChannelId;

    /**
    * 合约名称，可在合约列表或合约详情获取
    */
    @SerializedName("ChaincodeName")
    @Expose
    private String ChaincodeName;

    /**
    * 合约方法
    */
    @SerializedName("FuncName")
    @Expose
    private String FuncName;

    /**
    * 合约方法入参
    */
    @SerializedName("FuncParam")
    @Expose
    private String [] FuncParam;

    /**
     * Get 网络ID，可在区块链网络详情获取 
     * @return ClusterId 网络ID，可在区块链网络详情获取
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 网络ID，可在区块链网络详情获取
     * @param ClusterId 网络ID，可在区块链网络详情获取
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 通道ID，可在通道列表或通道详情获取 
     * @return ChannelId 通道ID，可在通道列表或通道详情获取
     */
    public String getChannelId() {
        return this.ChannelId;
    }

    /**
     * Set 通道ID，可在通道列表或通道详情获取
     * @param ChannelId 通道ID，可在通道列表或通道详情获取
     */
    public void setChannelId(String ChannelId) {
        this.ChannelId = ChannelId;
    }

    /**
     * Get 合约名称，可在合约列表或合约详情获取 
     * @return ChaincodeName 合约名称，可在合约列表或合约详情获取
     */
    public String getChaincodeName() {
        return this.ChaincodeName;
    }

    /**
     * Set 合约名称，可在合约列表或合约详情获取
     * @param ChaincodeName 合约名称，可在合约列表或合约详情获取
     */
    public void setChaincodeName(String ChaincodeName) {
        this.ChaincodeName = ChaincodeName;
    }

    /**
     * Get 合约方法 
     * @return FuncName 合约方法
     */
    public String getFuncName() {
        return this.FuncName;
    }

    /**
     * Set 合约方法
     * @param FuncName 合约方法
     */
    public void setFuncName(String FuncName) {
        this.FuncName = FuncName;
    }

    /**
     * Get 合约方法入参 
     * @return FuncParam 合约方法入参
     */
    public String [] getFuncParam() {
        return this.FuncParam;
    }

    /**
     * Set 合约方法入参
     * @param FuncParam 合约方法入参
     */
    public void setFuncParam(String [] FuncParam) {
        this.FuncParam = FuncParam;
    }

    public QueryFabricChaincodeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryFabricChaincodeRequest(QueryFabricChaincodeRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.ChannelId != null) {
            this.ChannelId = new String(source.ChannelId);
        }
        if (source.ChaincodeName != null) {
            this.ChaincodeName = new String(source.ChaincodeName);
        }
        if (source.FuncName != null) {
            this.FuncName = new String(source.FuncName);
        }
        if (source.FuncParam != null) {
            this.FuncParam = new String[source.FuncParam.length];
            for (int i = 0; i < source.FuncParam.length; i++) {
                this.FuncParam[i] = new String(source.FuncParam[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "ChannelId", this.ChannelId);
        this.setParamSimple(map, prefix + "ChaincodeName", this.ChaincodeName);
        this.setParamSimple(map, prefix + "FuncName", this.FuncName);
        this.setParamArraySimple(map, prefix + "FuncParam.", this.FuncParam);

    }
}

