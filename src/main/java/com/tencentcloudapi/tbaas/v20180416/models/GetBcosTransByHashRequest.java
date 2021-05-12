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

public class GetBcosTransByHashRequest extends AbstractModel{

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
    * 交易哈希值，可以从InvokeBcosTrans接口的返回值中解析获取
    */
    @SerializedName("TransHash")
    @Expose
    private String TransHash;

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
     * Get 交易哈希值，可以从InvokeBcosTrans接口的返回值中解析获取 
     * @return TransHash 交易哈希值，可以从InvokeBcosTrans接口的返回值中解析获取
     */
    public String getTransHash() {
        return this.TransHash;
    }

    /**
     * Set 交易哈希值，可以从InvokeBcosTrans接口的返回值中解析获取
     * @param TransHash 交易哈希值，可以从InvokeBcosTrans接口的返回值中解析获取
     */
    public void setTransHash(String TransHash) {
        this.TransHash = TransHash;
    }

    public GetBcosTransByHashRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetBcosTransByHashRequest(GetBcosTransByHashRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.GroupId != null) {
            this.GroupId = new Long(source.GroupId);
        }
        if (source.TransHash != null) {
            this.TransHash = new String(source.TransHash);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "TransHash", this.TransHash);

    }
}

