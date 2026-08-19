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
package com.tencentcloudapi.thpc.v20230321.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InquirePriceModifyWorkspacesChargeTypeRequest extends AbstractModel {

    /**
    * <p>工作空间 ID 列表。每次请求的工作空间计费模式必须一致。</p>
    */
    @SerializedName("SpaceIds")
    @Expose
    private String [] SpaceIds;

    /**
    * <p>转换的目标计费模式。当前仅支持 PREPAID（按量计费转包年包月）。</p>
    */
    @SerializedName("SpaceChargeType")
    @Expose
    private String SpaceChargeType;

    /**
    * <p>是否只进行参数和资源预检。true：不发起询价、组单或正式下单；false：执行对应操作。默认为 false。</p>
    */
    @SerializedName("DryRun")
    @Expose
    private Boolean DryRun;

    /**
    * <p>预付费参数。Period 和 RenewFlag 均为可选字段；未传入时后端使用默认值 Period=1、RenewFlag=NOTIFY_AND_MANUAL_RENEW。</p>
    */
    @SerializedName("SpaceChargePrepaid")
    @Expose
    private SpaceChargePrepaid SpaceChargePrepaid;

    /**
     * Get <p>工作空间 ID 列表。每次请求的工作空间计费模式必须一致。</p> 
     * @return SpaceIds <p>工作空间 ID 列表。每次请求的工作空间计费模式必须一致。</p>
     */
    public String [] getSpaceIds() {
        return this.SpaceIds;
    }

    /**
     * Set <p>工作空间 ID 列表。每次请求的工作空间计费模式必须一致。</p>
     * @param SpaceIds <p>工作空间 ID 列表。每次请求的工作空间计费模式必须一致。</p>
     */
    public void setSpaceIds(String [] SpaceIds) {
        this.SpaceIds = SpaceIds;
    }

    /**
     * Get <p>转换的目标计费模式。当前仅支持 PREPAID（按量计费转包年包月）。</p> 
     * @return SpaceChargeType <p>转换的目标计费模式。当前仅支持 PREPAID（按量计费转包年包月）。</p>
     */
    public String getSpaceChargeType() {
        return this.SpaceChargeType;
    }

    /**
     * Set <p>转换的目标计费模式。当前仅支持 PREPAID（按量计费转包年包月）。</p>
     * @param SpaceChargeType <p>转换的目标计费模式。当前仅支持 PREPAID（按量计费转包年包月）。</p>
     */
    public void setSpaceChargeType(String SpaceChargeType) {
        this.SpaceChargeType = SpaceChargeType;
    }

    /**
     * Get <p>是否只进行参数和资源预检。true：不发起询价、组单或正式下单；false：执行对应操作。默认为 false。</p> 
     * @return DryRun <p>是否只进行参数和资源预检。true：不发起询价、组单或正式下单；false：执行对应操作。默认为 false。</p>
     */
    public Boolean getDryRun() {
        return this.DryRun;
    }

    /**
     * Set <p>是否只进行参数和资源预检。true：不发起询价、组单或正式下单；false：执行对应操作。默认为 false。</p>
     * @param DryRun <p>是否只进行参数和资源预检。true：不发起询价、组单或正式下单；false：执行对应操作。默认为 false。</p>
     */
    public void setDryRun(Boolean DryRun) {
        this.DryRun = DryRun;
    }

    /**
     * Get <p>预付费参数。Period 和 RenewFlag 均为可选字段；未传入时后端使用默认值 Period=1、RenewFlag=NOTIFY_AND_MANUAL_RENEW。</p> 
     * @return SpaceChargePrepaid <p>预付费参数。Period 和 RenewFlag 均为可选字段；未传入时后端使用默认值 Period=1、RenewFlag=NOTIFY_AND_MANUAL_RENEW。</p>
     */
    public SpaceChargePrepaid getSpaceChargePrepaid() {
        return this.SpaceChargePrepaid;
    }

    /**
     * Set <p>预付费参数。Period 和 RenewFlag 均为可选字段；未传入时后端使用默认值 Period=1、RenewFlag=NOTIFY_AND_MANUAL_RENEW。</p>
     * @param SpaceChargePrepaid <p>预付费参数。Period 和 RenewFlag 均为可选字段；未传入时后端使用默认值 Period=1、RenewFlag=NOTIFY_AND_MANUAL_RENEW。</p>
     */
    public void setSpaceChargePrepaid(SpaceChargePrepaid SpaceChargePrepaid) {
        this.SpaceChargePrepaid = SpaceChargePrepaid;
    }

    public InquirePriceModifyWorkspacesChargeTypeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InquirePriceModifyWorkspacesChargeTypeRequest(InquirePriceModifyWorkspacesChargeTypeRequest source) {
        if (source.SpaceIds != null) {
            this.SpaceIds = new String[source.SpaceIds.length];
            for (int i = 0; i < source.SpaceIds.length; i++) {
                this.SpaceIds[i] = new String(source.SpaceIds[i]);
            }
        }
        if (source.SpaceChargeType != null) {
            this.SpaceChargeType = new String(source.SpaceChargeType);
        }
        if (source.DryRun != null) {
            this.DryRun = new Boolean(source.DryRun);
        }
        if (source.SpaceChargePrepaid != null) {
            this.SpaceChargePrepaid = new SpaceChargePrepaid(source.SpaceChargePrepaid);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "SpaceIds.", this.SpaceIds);
        this.setParamSimple(map, prefix + "SpaceChargeType", this.SpaceChargeType);
        this.setParamSimple(map, prefix + "DryRun", this.DryRun);
        this.setParamObj(map, prefix + "SpaceChargePrepaid.", this.SpaceChargePrepaid);

    }
}

