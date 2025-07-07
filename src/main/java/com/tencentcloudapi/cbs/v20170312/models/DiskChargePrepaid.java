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
package com.tencentcloudapi.cbs.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DiskChargePrepaid extends AbstractModel {

    /**
    * 购买云硬盘的时长，默认单位为月，取值范围：1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 24, 36。
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * 自动续费标识。取值范围：
<ul>
  <li>NOTIFY_AND_AUTO_RENEW：通知过期且自动续费</li>
  <li>NOTIFY_AND_MANUAL_RENEW：通知过期不自动续费</li>
  <li>DISABLE_NOTIFY_AND_MANUAL_RENEW：不通知过期不自动续费</li>
</ul>
默认取值：NOTIFY_AND_MANUAL_RENEW。
    */
    @SerializedName("RenewFlag")
    @Expose
    private String RenewFlag;

    /**
    * 需要将云硬盘的到期时间与挂载的子机对齐时，可传入该参数。该参数表示子机当前的到期时间，此时Period如果传入，则表示子机需要续费的时长，云盘会自动按对齐到子机续费后的到期时间续费.
    */
    @SerializedName("CurInstanceDeadline")
    @Expose
    private String CurInstanceDeadline;

    /**
     * Get 购买云硬盘的时长，默认单位为月，取值范围：1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 24, 36。 
     * @return Period 购买云硬盘的时长，默认单位为月，取值范围：1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 24, 36。
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set 购买云硬盘的时长，默认单位为月，取值范围：1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 24, 36。
     * @param Period 购买云硬盘的时长，默认单位为月，取值范围：1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 24, 36。
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get 自动续费标识。取值范围：
<ul>
  <li>NOTIFY_AND_AUTO_RENEW：通知过期且自动续费</li>
  <li>NOTIFY_AND_MANUAL_RENEW：通知过期不自动续费</li>
  <li>DISABLE_NOTIFY_AND_MANUAL_RENEW：不通知过期不自动续费</li>
</ul>
默认取值：NOTIFY_AND_MANUAL_RENEW。 
     * @return RenewFlag 自动续费标识。取值范围：
<ul>
  <li>NOTIFY_AND_AUTO_RENEW：通知过期且自动续费</li>
  <li>NOTIFY_AND_MANUAL_RENEW：通知过期不自动续费</li>
  <li>DISABLE_NOTIFY_AND_MANUAL_RENEW：不通知过期不自动续费</li>
</ul>
默认取值：NOTIFY_AND_MANUAL_RENEW。
     */
    public String getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set 自动续费标识。取值范围：
<ul>
  <li>NOTIFY_AND_AUTO_RENEW：通知过期且自动续费</li>
  <li>NOTIFY_AND_MANUAL_RENEW：通知过期不自动续费</li>
  <li>DISABLE_NOTIFY_AND_MANUAL_RENEW：不通知过期不自动续费</li>
</ul>
默认取值：NOTIFY_AND_MANUAL_RENEW。
     * @param RenewFlag 自动续费标识。取值范围：
<ul>
  <li>NOTIFY_AND_AUTO_RENEW：通知过期且自动续费</li>
  <li>NOTIFY_AND_MANUAL_RENEW：通知过期不自动续费</li>
  <li>DISABLE_NOTIFY_AND_MANUAL_RENEW：不通知过期不自动续费</li>
</ul>
默认取值：NOTIFY_AND_MANUAL_RENEW。
     */
    public void setRenewFlag(String RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    /**
     * Get 需要将云硬盘的到期时间与挂载的子机对齐时，可传入该参数。该参数表示子机当前的到期时间，此时Period如果传入，则表示子机需要续费的时长，云盘会自动按对齐到子机续费后的到期时间续费. 
     * @return CurInstanceDeadline 需要将云硬盘的到期时间与挂载的子机对齐时，可传入该参数。该参数表示子机当前的到期时间，此时Period如果传入，则表示子机需要续费的时长，云盘会自动按对齐到子机续费后的到期时间续费.
     */
    public String getCurInstanceDeadline() {
        return this.CurInstanceDeadline;
    }

    /**
     * Set 需要将云硬盘的到期时间与挂载的子机对齐时，可传入该参数。该参数表示子机当前的到期时间，此时Period如果传入，则表示子机需要续费的时长，云盘会自动按对齐到子机续费后的到期时间续费.
     * @param CurInstanceDeadline 需要将云硬盘的到期时间与挂载的子机对齐时，可传入该参数。该参数表示子机当前的到期时间，此时Period如果传入，则表示子机需要续费的时长，云盘会自动按对齐到子机续费后的到期时间续费.
     */
    public void setCurInstanceDeadline(String CurInstanceDeadline) {
        this.CurInstanceDeadline = CurInstanceDeadline;
    }

    public DiskChargePrepaid() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DiskChargePrepaid(DiskChargePrepaid source) {
        if (source.Period != null) {
            this.Period = new Long(source.Period);
        }
        if (source.RenewFlag != null) {
            this.RenewFlag = new String(source.RenewFlag);
        }
        if (source.CurInstanceDeadline != null) {
            this.CurInstanceDeadline = new String(source.CurInstanceDeadline);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "RenewFlag", this.RenewFlag);
        this.setParamSimple(map, prefix + "CurInstanceDeadline", this.CurInstanceDeadline);

    }
}

