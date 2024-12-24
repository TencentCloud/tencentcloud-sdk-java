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
package com.tencentcloudapi.essbasic.v20210526.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DynamicFlowApproverResult extends AbstractModel {

    /**
    * 签署流程签署人在模板中对应的签署人Id；在非单方签署、以及非B2C签署的场景下必传，用于指定当前签署方在签署流程中的位置；	
    */
    @SerializedName("RecipientId")
    @Expose
    private String RecipientId;

    /**
    * 签署ID - 发起流程时系统自动补充 - 创建签署链接时，可以通过查询详情接口获得签署人的SignId，然后可传入此值为该签署人创建签署链接，无需再传姓名、手机号、证件号等其他信息	
    */
    @SerializedName("SignId")
    @Expose
    private String SignId;

    /**
    * 签署人状态信息
    */
    @SerializedName("ApproverStatus")
    @Expose
    private Long ApproverStatus;

    /**
     * Get 签署流程签署人在模板中对应的签署人Id；在非单方签署、以及非B2C签署的场景下必传，用于指定当前签署方在签署流程中的位置；	 
     * @return RecipientId 签署流程签署人在模板中对应的签署人Id；在非单方签署、以及非B2C签署的场景下必传，用于指定当前签署方在签署流程中的位置；	
     */
    public String getRecipientId() {
        return this.RecipientId;
    }

    /**
     * Set 签署流程签署人在模板中对应的签署人Id；在非单方签署、以及非B2C签署的场景下必传，用于指定当前签署方在签署流程中的位置；	
     * @param RecipientId 签署流程签署人在模板中对应的签署人Id；在非单方签署、以及非B2C签署的场景下必传，用于指定当前签署方在签署流程中的位置；	
     */
    public void setRecipientId(String RecipientId) {
        this.RecipientId = RecipientId;
    }

    /**
     * Get 签署ID - 发起流程时系统自动补充 - 创建签署链接时，可以通过查询详情接口获得签署人的SignId，然后可传入此值为该签署人创建签署链接，无需再传姓名、手机号、证件号等其他信息	 
     * @return SignId 签署ID - 发起流程时系统自动补充 - 创建签署链接时，可以通过查询详情接口获得签署人的SignId，然后可传入此值为该签署人创建签署链接，无需再传姓名、手机号、证件号等其他信息	
     */
    public String getSignId() {
        return this.SignId;
    }

    /**
     * Set 签署ID - 发起流程时系统自动补充 - 创建签署链接时，可以通过查询详情接口获得签署人的SignId，然后可传入此值为该签署人创建签署链接，无需再传姓名、手机号、证件号等其他信息	
     * @param SignId 签署ID - 发起流程时系统自动补充 - 创建签署链接时，可以通过查询详情接口获得签署人的SignId，然后可传入此值为该签署人创建签署链接，无需再传姓名、手机号、证件号等其他信息	
     */
    public void setSignId(String SignId) {
        this.SignId = SignId;
    }

    /**
     * Get 签署人状态信息 
     * @return ApproverStatus 签署人状态信息
     */
    public Long getApproverStatus() {
        return this.ApproverStatus;
    }

    /**
     * Set 签署人状态信息
     * @param ApproverStatus 签署人状态信息
     */
    public void setApproverStatus(Long ApproverStatus) {
        this.ApproverStatus = ApproverStatus;
    }

    public DynamicFlowApproverResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DynamicFlowApproverResult(DynamicFlowApproverResult source) {
        if (source.RecipientId != null) {
            this.RecipientId = new String(source.RecipientId);
        }
        if (source.SignId != null) {
            this.SignId = new String(source.SignId);
        }
        if (source.ApproverStatus != null) {
            this.ApproverStatus = new Long(source.ApproverStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RecipientId", this.RecipientId);
        this.setParamSimple(map, prefix + "SignId", this.SignId);
        this.setParamSimple(map, prefix + "ApproverStatus", this.ApproverStatus);

    }
}

