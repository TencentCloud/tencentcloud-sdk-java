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
package com.tencentcloudapi.rum.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateWhitelistRequest extends AbstractModel {

    /**
    * <p>实例ID：taw-123</p>
    */
    @SerializedName("InstanceID")
    @Expose
    private String InstanceID;

    /**
    * <p>备注（暂未作字节数限制）</p>
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * <p>uin：业务方标识</p>
    */
    @SerializedName("WhitelistUin")
    @Expose
    private String WhitelistUin;

    /**
    * <p>业务方标识</p>
    */
    @SerializedName("Aid")
    @Expose
    private String Aid;

    /**
     * Get <p>实例ID：taw-123</p> 
     * @return InstanceID <p>实例ID：taw-123</p>
     */
    public String getInstanceID() {
        return this.InstanceID;
    }

    /**
     * Set <p>实例ID：taw-123</p>
     * @param InstanceID <p>实例ID：taw-123</p>
     */
    public void setInstanceID(String InstanceID) {
        this.InstanceID = InstanceID;
    }

    /**
     * Get <p>备注（暂未作字节数限制）</p> 
     * @return Remark <p>备注（暂未作字节数限制）</p>
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set <p>备注（暂未作字节数限制）</p>
     * @param Remark <p>备注（暂未作字节数限制）</p>
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get <p>uin：业务方标识</p> 
     * @return WhitelistUin <p>uin：业务方标识</p>
     */
    public String getWhitelistUin() {
        return this.WhitelistUin;
    }

    /**
     * Set <p>uin：业务方标识</p>
     * @param WhitelistUin <p>uin：业务方标识</p>
     */
    public void setWhitelistUin(String WhitelistUin) {
        this.WhitelistUin = WhitelistUin;
    }

    /**
     * Get <p>业务方标识</p> 
     * @return Aid <p>业务方标识</p>
     */
    public String getAid() {
        return this.Aid;
    }

    /**
     * Set <p>业务方标识</p>
     * @param Aid <p>业务方标识</p>
     */
    public void setAid(String Aid) {
        this.Aid = Aid;
    }

    public CreateWhitelistRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateWhitelistRequest(CreateWhitelistRequest source) {
        if (source.InstanceID != null) {
            this.InstanceID = new String(source.InstanceID);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.WhitelistUin != null) {
            this.WhitelistUin = new String(source.WhitelistUin);
        }
        if (source.Aid != null) {
            this.Aid = new String(source.Aid);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceID", this.InstanceID);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "WhitelistUin", this.WhitelistUin);
        this.setParamSimple(map, prefix + "Aid", this.Aid);

    }
}

