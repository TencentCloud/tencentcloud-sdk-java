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
package com.tencentcloudapi.dayu.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateBoundIPRequest extends AbstractModel{

    /**
    * 大禹子产品代号（bgp表示独享包；bgp-multip表示共享包）
    */
    @SerializedName("Business")
    @Expose
    private String Business;

    /**
    * 资源实例ID
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 绑定到资源实例的IP数组，当资源实例为高防包(独享包)时，数组只允许填1个IP；当没有要绑定的IP时可以为空数组；但是BoundDevList和UnBoundDevList至少有一个不为空；
    */
    @SerializedName("BoundDevList")
    @Expose
    private BoundIpInfo [] BoundDevList;

    /**
    * 与资源实例解绑的IP数组，当资源实例为高防包(独享包)时，数组只允许填1个IP；当没有要解绑的IP时可以为空数组；但是BoundDevList和UnBoundDevList至少有一个不为空；
    */
    @SerializedName("UnBoundDevList")
    @Expose
    private BoundIpInfo [] UnBoundDevList;

    /**
    * 已弃用，不填
    */
    @SerializedName("CopyPolicy")
    @Expose
    private String CopyPolicy;

    /**
     * Get 大禹子产品代号（bgp表示独享包；bgp-multip表示共享包） 
     * @return Business 大禹子产品代号（bgp表示独享包；bgp-multip表示共享包）
     */
    public String getBusiness() {
        return this.Business;
    }

    /**
     * Set 大禹子产品代号（bgp表示独享包；bgp-multip表示共享包）
     * @param Business 大禹子产品代号（bgp表示独享包；bgp-multip表示共享包）
     */
    public void setBusiness(String Business) {
        this.Business = Business;
    }

    /**
     * Get 资源实例ID 
     * @return Id 资源实例ID
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 资源实例ID
     * @param Id 资源实例ID
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 绑定到资源实例的IP数组，当资源实例为高防包(独享包)时，数组只允许填1个IP；当没有要绑定的IP时可以为空数组；但是BoundDevList和UnBoundDevList至少有一个不为空； 
     * @return BoundDevList 绑定到资源实例的IP数组，当资源实例为高防包(独享包)时，数组只允许填1个IP；当没有要绑定的IP时可以为空数组；但是BoundDevList和UnBoundDevList至少有一个不为空；
     */
    public BoundIpInfo [] getBoundDevList() {
        return this.BoundDevList;
    }

    /**
     * Set 绑定到资源实例的IP数组，当资源实例为高防包(独享包)时，数组只允许填1个IP；当没有要绑定的IP时可以为空数组；但是BoundDevList和UnBoundDevList至少有一个不为空；
     * @param BoundDevList 绑定到资源实例的IP数组，当资源实例为高防包(独享包)时，数组只允许填1个IP；当没有要绑定的IP时可以为空数组；但是BoundDevList和UnBoundDevList至少有一个不为空；
     */
    public void setBoundDevList(BoundIpInfo [] BoundDevList) {
        this.BoundDevList = BoundDevList;
    }

    /**
     * Get 与资源实例解绑的IP数组，当资源实例为高防包(独享包)时，数组只允许填1个IP；当没有要解绑的IP时可以为空数组；但是BoundDevList和UnBoundDevList至少有一个不为空； 
     * @return UnBoundDevList 与资源实例解绑的IP数组，当资源实例为高防包(独享包)时，数组只允许填1个IP；当没有要解绑的IP时可以为空数组；但是BoundDevList和UnBoundDevList至少有一个不为空；
     */
    public BoundIpInfo [] getUnBoundDevList() {
        return this.UnBoundDevList;
    }

    /**
     * Set 与资源实例解绑的IP数组，当资源实例为高防包(独享包)时，数组只允许填1个IP；当没有要解绑的IP时可以为空数组；但是BoundDevList和UnBoundDevList至少有一个不为空；
     * @param UnBoundDevList 与资源实例解绑的IP数组，当资源实例为高防包(独享包)时，数组只允许填1个IP；当没有要解绑的IP时可以为空数组；但是BoundDevList和UnBoundDevList至少有一个不为空；
     */
    public void setUnBoundDevList(BoundIpInfo [] UnBoundDevList) {
        this.UnBoundDevList = UnBoundDevList;
    }

    /**
     * Get 已弃用，不填 
     * @return CopyPolicy 已弃用，不填
     */
    public String getCopyPolicy() {
        return this.CopyPolicy;
    }

    /**
     * Set 已弃用，不填
     * @param CopyPolicy 已弃用，不填
     */
    public void setCopyPolicy(String CopyPolicy) {
        this.CopyPolicy = CopyPolicy;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Business", this.Business);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamArrayObj(map, prefix + "BoundDevList.", this.BoundDevList);
        this.setParamArrayObj(map, prefix + "UnBoundDevList.", this.UnBoundDevList);
        this.setParamSimple(map, prefix + "CopyPolicy", this.CopyPolicy);

    }
}

