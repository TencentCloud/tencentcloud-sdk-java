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
package com.tencentcloudapi.antiddos.v20200309.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteDDoSBlackWhiteIpListRequest extends AbstractModel{

    /**
    * 资源实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * IP列表
    */
    @SerializedName("IpList")
    @Expose
    private IpSegment [] IpList;

    /**
    * IP类型，取值[black(黑名单IP), white(白名单IP)]
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
     * Get 资源实例ID 
     * @return InstanceId 资源实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 资源实例ID
     * @param InstanceId 资源实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get IP列表 
     * @return IpList IP列表
     */
    public IpSegment [] getIpList() {
        return this.IpList;
    }

    /**
     * Set IP列表
     * @param IpList IP列表
     */
    public void setIpList(IpSegment [] IpList) {
        this.IpList = IpList;
    }

    /**
     * Get IP类型，取值[black(黑名单IP), white(白名单IP)] 
     * @return Type IP类型，取值[black(黑名单IP), white(白名单IP)]
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set IP类型，取值[black(黑名单IP), white(白名单IP)]
     * @param Type IP类型，取值[black(黑名单IP), white(白名单IP)]
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    public DeleteDDoSBlackWhiteIpListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteDDoSBlackWhiteIpListRequest(DeleteDDoSBlackWhiteIpListRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.IpList != null) {
            this.IpList = new IpSegment[source.IpList.length];
            for (int i = 0; i < source.IpList.length; i++) {
                this.IpList[i] = new IpSegment(source.IpList[i]);
            }
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArrayObj(map, prefix + "IpList.", this.IpList);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

