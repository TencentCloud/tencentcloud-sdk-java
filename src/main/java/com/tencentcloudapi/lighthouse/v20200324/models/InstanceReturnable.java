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
package com.tencentcloudapi.lighthouse.v20200324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceReturnable extends AbstractModel{

    /**
    * 实例 ID。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 实例是否可退还。
    */
    @SerializedName("IsReturnable")
    @Expose
    private Boolean IsReturnable;

    /**
    * 实例退还失败错误码。
    */
    @SerializedName("ReturnFailCode")
    @Expose
    private Long ReturnFailCode;

    /**
    * 实例退还失败错误信息。
    */
    @SerializedName("ReturnFailMessage")
    @Expose
    private String ReturnFailMessage;

    /**
     * Get 实例 ID。 
     * @return InstanceId 实例 ID。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例 ID。
     * @param InstanceId 实例 ID。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 实例是否可退还。 
     * @return IsReturnable 实例是否可退还。
     */
    public Boolean getIsReturnable() {
        return this.IsReturnable;
    }

    /**
     * Set 实例是否可退还。
     * @param IsReturnable 实例是否可退还。
     */
    public void setIsReturnable(Boolean IsReturnable) {
        this.IsReturnable = IsReturnable;
    }

    /**
     * Get 实例退还失败错误码。 
     * @return ReturnFailCode 实例退还失败错误码。
     */
    public Long getReturnFailCode() {
        return this.ReturnFailCode;
    }

    /**
     * Set 实例退还失败错误码。
     * @param ReturnFailCode 实例退还失败错误码。
     */
    public void setReturnFailCode(Long ReturnFailCode) {
        this.ReturnFailCode = ReturnFailCode;
    }

    /**
     * Get 实例退还失败错误信息。 
     * @return ReturnFailMessage 实例退还失败错误信息。
     */
    public String getReturnFailMessage() {
        return this.ReturnFailMessage;
    }

    /**
     * Set 实例退还失败错误信息。
     * @param ReturnFailMessage 实例退还失败错误信息。
     */
    public void setReturnFailMessage(String ReturnFailMessage) {
        this.ReturnFailMessage = ReturnFailMessage;
    }

    public InstanceReturnable() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceReturnable(InstanceReturnable source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.IsReturnable != null) {
            this.IsReturnable = new Boolean(source.IsReturnable);
        }
        if (source.ReturnFailCode != null) {
            this.ReturnFailCode = new Long(source.ReturnFailCode);
        }
        if (source.ReturnFailMessage != null) {
            this.ReturnFailMessage = new String(source.ReturnFailMessage);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "IsReturnable", this.IsReturnable);
        this.setParamSimple(map, prefix + "ReturnFailCode", this.ReturnFailCode);
        this.setParamSimple(map, prefix + "ReturnFailMessage", this.ReturnFailMessage);

    }
}

