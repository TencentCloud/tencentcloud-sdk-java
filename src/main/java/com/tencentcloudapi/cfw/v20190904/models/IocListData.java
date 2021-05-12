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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IocListData extends AbstractModel{

    /**
    * 待处置IP地址，IP/Domain字段二选一
    */
    @SerializedName("IP")
    @Expose
    private String IP;

    /**
    * 只能为0或者1   0代表出站 1代表入站
    */
    @SerializedName("Direction")
    @Expose
    private Long Direction;

    /**
    * 待处置域名，IP/Domain字段二选一
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
     * Get 待处置IP地址，IP/Domain字段二选一 
     * @return IP 待处置IP地址，IP/Domain字段二选一
     */
    public String getIP() {
        return this.IP;
    }

    /**
     * Set 待处置IP地址，IP/Domain字段二选一
     * @param IP 待处置IP地址，IP/Domain字段二选一
     */
    public void setIP(String IP) {
        this.IP = IP;
    }

    /**
     * Get 只能为0或者1   0代表出站 1代表入站 
     * @return Direction 只能为0或者1   0代表出站 1代表入站
     */
    public Long getDirection() {
        return this.Direction;
    }

    /**
     * Set 只能为0或者1   0代表出站 1代表入站
     * @param Direction 只能为0或者1   0代表出站 1代表入站
     */
    public void setDirection(Long Direction) {
        this.Direction = Direction;
    }

    /**
     * Get 待处置域名，IP/Domain字段二选一 
     * @return Domain 待处置域名，IP/Domain字段二选一
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 待处置域名，IP/Domain字段二选一
     * @param Domain 待处置域名，IP/Domain字段二选一
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    public IocListData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IocListData(IocListData source) {
        if (source.IP != null) {
            this.IP = new String(source.IP);
        }
        if (source.Direction != null) {
            this.Direction = new Long(source.Direction);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IP", this.IP);
        this.setParamSimple(map, prefix + "Direction", this.Direction);
        this.setParamSimple(map, prefix + "Domain", this.Domain);

    }
}

