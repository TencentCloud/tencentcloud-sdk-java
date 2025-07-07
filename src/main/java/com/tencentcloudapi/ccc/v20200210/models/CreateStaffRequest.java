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
package com.tencentcloudapi.ccc.v20200210.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateStaffRequest extends AbstractModel {

    /**
    * 应用 ID（必填），可以查看 https://console.cloud.tencent.com/ccc
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * 客服信息，个数不超过 10
    */
    @SerializedName("Staffs")
    @Expose
    private SeatUserInfo [] Staffs;

    /**
    * 是否发送密码邮件，默认true
    */
    @SerializedName("SendPassword")
    @Expose
    private Boolean SendPassword;

    /**
     * Get 应用 ID（必填），可以查看 https://console.cloud.tencent.com/ccc 
     * @return SdkAppId 应用 ID（必填），可以查看 https://console.cloud.tencent.com/ccc
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set 应用 ID（必填），可以查看 https://console.cloud.tencent.com/ccc
     * @param SdkAppId 应用 ID（必填），可以查看 https://console.cloud.tencent.com/ccc
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get 客服信息，个数不超过 10 
     * @return Staffs 客服信息，个数不超过 10
     */
    public SeatUserInfo [] getStaffs() {
        return this.Staffs;
    }

    /**
     * Set 客服信息，个数不超过 10
     * @param Staffs 客服信息，个数不超过 10
     */
    public void setStaffs(SeatUserInfo [] Staffs) {
        this.Staffs = Staffs;
    }

    /**
     * Get 是否发送密码邮件，默认true 
     * @return SendPassword 是否发送密码邮件，默认true
     */
    public Boolean getSendPassword() {
        return this.SendPassword;
    }

    /**
     * Set 是否发送密码邮件，默认true
     * @param SendPassword 是否发送密码邮件，默认true
     */
    public void setSendPassword(Boolean SendPassword) {
        this.SendPassword = SendPassword;
    }

    public CreateStaffRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateStaffRequest(CreateStaffRequest source) {
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.Staffs != null) {
            this.Staffs = new SeatUserInfo[source.Staffs.length];
            for (int i = 0; i < source.Staffs.length; i++) {
                this.Staffs[i] = new SeatUserInfo(source.Staffs[i]);
            }
        }
        if (source.SendPassword != null) {
            this.SendPassword = new Boolean(source.SendPassword);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamArrayObj(map, prefix + "Staffs.", this.Staffs);
        this.setParamSimple(map, prefix + "SendPassword", this.SendPassword);

    }
}

