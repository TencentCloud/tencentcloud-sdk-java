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
package com.tencentcloudapi.dasb.v20191018.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDeviceAccountsRequest extends AbstractModel{

    /**
    * 主机账号ID集合，非必需，如果使用IdSet则忽略其他过滤参数
    */
    @SerializedName("IdSet")
    @Expose
    private Long [] IdSet;

    /**
    * 主机账号名，模糊查询，不能单独出现，必须于DeviceId一起提交
    */
    @SerializedName("Account")
    @Expose
    private String Account;

    /**
    * 主机ID，未使用IdSet时必须携带
    */
    @SerializedName("DeviceId")
    @Expose
    private Long DeviceId;

    /**
    * 分页偏移位置，默认值为0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 每页条目数量，默认20
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get 主机账号ID集合，非必需，如果使用IdSet则忽略其他过滤参数 
     * @return IdSet 主机账号ID集合，非必需，如果使用IdSet则忽略其他过滤参数
     */
    public Long [] getIdSet() {
        return this.IdSet;
    }

    /**
     * Set 主机账号ID集合，非必需，如果使用IdSet则忽略其他过滤参数
     * @param IdSet 主机账号ID集合，非必需，如果使用IdSet则忽略其他过滤参数
     */
    public void setIdSet(Long [] IdSet) {
        this.IdSet = IdSet;
    }

    /**
     * Get 主机账号名，模糊查询，不能单独出现，必须于DeviceId一起提交 
     * @return Account 主机账号名，模糊查询，不能单独出现，必须于DeviceId一起提交
     */
    public String getAccount() {
        return this.Account;
    }

    /**
     * Set 主机账号名，模糊查询，不能单独出现，必须于DeviceId一起提交
     * @param Account 主机账号名，模糊查询，不能单独出现，必须于DeviceId一起提交
     */
    public void setAccount(String Account) {
        this.Account = Account;
    }

    /**
     * Get 主机ID，未使用IdSet时必须携带 
     * @return DeviceId 主机ID，未使用IdSet时必须携带
     */
    public Long getDeviceId() {
        return this.DeviceId;
    }

    /**
     * Set 主机ID，未使用IdSet时必须携带
     * @param DeviceId 主机ID，未使用IdSet时必须携带
     */
    public void setDeviceId(Long DeviceId) {
        this.DeviceId = DeviceId;
    }

    /**
     * Get 分页偏移位置，默认值为0 
     * @return Offset 分页偏移位置，默认值为0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页偏移位置，默认值为0
     * @param Offset 分页偏移位置，默认值为0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 每页条目数量，默认20 
     * @return Limit 每页条目数量，默认20
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 每页条目数量，默认20
     * @param Limit 每页条目数量，默认20
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeDeviceAccountsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDeviceAccountsRequest(DescribeDeviceAccountsRequest source) {
        if (source.IdSet != null) {
            this.IdSet = new Long[source.IdSet.length];
            for (int i = 0; i < source.IdSet.length; i++) {
                this.IdSet[i] = new Long(source.IdSet[i]);
            }
        }
        if (source.Account != null) {
            this.Account = new String(source.Account);
        }
        if (source.DeviceId != null) {
            this.DeviceId = new Long(source.DeviceId);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "IdSet.", this.IdSet);
        this.setParamSimple(map, prefix + "Account", this.Account);
        this.setParamSimple(map, prefix + "DeviceId", this.DeviceId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

