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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NetworkAccessControl extends AbstractModel{

    /**
    * 访问模式：Whitelist|Blacklist
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
    * 白名单列表
    */
    @SerializedName("CidrWhiteList")
    @Expose
    private String [] CidrWhiteList;

    /**
    * 黑名单列表
    */
    @SerializedName("CidrBlackList")
    @Expose
    private String [] CidrBlackList;

    /**
     * Get 访问模式：Whitelist|Blacklist 
     * @return Mode 访问模式：Whitelist|Blacklist
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set 访问模式：Whitelist|Blacklist
     * @param Mode 访问模式：Whitelist|Blacklist
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    /**
     * Get 白名单列表 
     * @return CidrWhiteList 白名单列表
     */
    public String [] getCidrWhiteList() {
        return this.CidrWhiteList;
    }

    /**
     * Set 白名单列表
     * @param CidrWhiteList 白名单列表
     */
    public void setCidrWhiteList(String [] CidrWhiteList) {
        this.CidrWhiteList = CidrWhiteList;
    }

    /**
     * Get 黑名单列表 
     * @return CidrBlackList 黑名单列表
     */
    public String [] getCidrBlackList() {
        return this.CidrBlackList;
    }

    /**
     * Set 黑名单列表
     * @param CidrBlackList 黑名单列表
     */
    public void setCidrBlackList(String [] CidrBlackList) {
        this.CidrBlackList = CidrBlackList;
    }

    public NetworkAccessControl() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NetworkAccessControl(NetworkAccessControl source) {
        if (source.Mode != null) {
            this.Mode = new String(source.Mode);
        }
        if (source.CidrWhiteList != null) {
            this.CidrWhiteList = new String[source.CidrWhiteList.length];
            for (int i = 0; i < source.CidrWhiteList.length; i++) {
                this.CidrWhiteList[i] = new String(source.CidrWhiteList[i]);
            }
        }
        if (source.CidrBlackList != null) {
            this.CidrBlackList = new String[source.CidrBlackList.length];
            for (int i = 0; i < source.CidrBlackList.length; i++) {
                this.CidrBlackList[i] = new String(source.CidrBlackList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamArraySimple(map, prefix + "CidrWhiteList.", this.CidrWhiteList);
        this.setParamArraySimple(map, prefix + "CidrBlackList.", this.CidrBlackList);

    }
}

