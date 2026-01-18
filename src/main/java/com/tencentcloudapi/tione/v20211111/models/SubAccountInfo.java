/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SubAccountInfo extends AbstractModel {

    /**
    * 腾讯云主账号UIN
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * 腾讯云子账号UIN
    */
    @SerializedName("SubUin")
    @Expose
    private String SubUin;

    /**
    * 子账号名称
    */
    @SerializedName("SubUinName")
    @Expose
    private String SubUinName;

    /**
    * 子账号在Linux下的UID
    */
    @SerializedName("LinuxUid")
    @Expose
    private Long LinuxUid;

    /**
    * 子账号在Linux下的GID
    */
    @SerializedName("LinuxGid")
    @Expose
    private Long LinuxGid;

    /**
     * Get 腾讯云主账号UIN 
     * @return Uin 腾讯云主账号UIN
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set 腾讯云主账号UIN
     * @param Uin 腾讯云主账号UIN
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get 腾讯云子账号UIN 
     * @return SubUin 腾讯云子账号UIN
     */
    public String getSubUin() {
        return this.SubUin;
    }

    /**
     * Set 腾讯云子账号UIN
     * @param SubUin 腾讯云子账号UIN
     */
    public void setSubUin(String SubUin) {
        this.SubUin = SubUin;
    }

    /**
     * Get 子账号名称 
     * @return SubUinName 子账号名称
     */
    public String getSubUinName() {
        return this.SubUinName;
    }

    /**
     * Set 子账号名称
     * @param SubUinName 子账号名称
     */
    public void setSubUinName(String SubUinName) {
        this.SubUinName = SubUinName;
    }

    /**
     * Get 子账号在Linux下的UID 
     * @return LinuxUid 子账号在Linux下的UID
     */
    public Long getLinuxUid() {
        return this.LinuxUid;
    }

    /**
     * Set 子账号在Linux下的UID
     * @param LinuxUid 子账号在Linux下的UID
     */
    public void setLinuxUid(Long LinuxUid) {
        this.LinuxUid = LinuxUid;
    }

    /**
     * Get 子账号在Linux下的GID 
     * @return LinuxGid 子账号在Linux下的GID
     */
    public Long getLinuxGid() {
        return this.LinuxGid;
    }

    /**
     * Set 子账号在Linux下的GID
     * @param LinuxGid 子账号在Linux下的GID
     */
    public void setLinuxGid(Long LinuxGid) {
        this.LinuxGid = LinuxGid;
    }

    public SubAccountInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SubAccountInfo(SubAccountInfo source) {
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.SubUin != null) {
            this.SubUin = new String(source.SubUin);
        }
        if (source.SubUinName != null) {
            this.SubUinName = new String(source.SubUinName);
        }
        if (source.LinuxUid != null) {
            this.LinuxUid = new Long(source.LinuxUid);
        }
        if (source.LinuxGid != null) {
            this.LinuxGid = new Long(source.LinuxGid);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "SubUin", this.SubUin);
        this.setParamSimple(map, prefix + "SubUinName", this.SubUinName);
        this.setParamSimple(map, prefix + "LinuxUid", this.LinuxUid);
        this.setParamSimple(map, prefix + "LinuxGid", this.LinuxGid);

    }
}

