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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeLicenseStatusResponse extends AbstractModel {

    /**
    * <p>授权状态列表（旗舰版→专业版→RASP）</p>
    */
    @SerializedName("List")
    @Expose
    private LicenseStatusItem [] List;

    /**
    * <p>自动加购开关 0-关 1-开</p>
    */
    @SerializedName("AutoRepurchaseSwitch")
    @Expose
    private Long AutoRepurchaseSwitch;

    /**
    * <p>合并剩余解绑次数 = (旗舰版total + 专业版total) × 2 - 当月已解绑次数</p>
    */
    @SerializedName("UnbindCountLeft")
    @Expose
    private Long UnbindCountLeft;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>授权状态列表（旗舰版→专业版→RASP）</p> 
     * @return List <p>授权状态列表（旗舰版→专业版→RASP）</p>
     */
    public LicenseStatusItem [] getList() {
        return this.List;
    }

    /**
     * Set <p>授权状态列表（旗舰版→专业版→RASP）</p>
     * @param List <p>授权状态列表（旗舰版→专业版→RASP）</p>
     */
    public void setList(LicenseStatusItem [] List) {
        this.List = List;
    }

    /**
     * Get <p>自动加购开关 0-关 1-开</p> 
     * @return AutoRepurchaseSwitch <p>自动加购开关 0-关 1-开</p>
     */
    public Long getAutoRepurchaseSwitch() {
        return this.AutoRepurchaseSwitch;
    }

    /**
     * Set <p>自动加购开关 0-关 1-开</p>
     * @param AutoRepurchaseSwitch <p>自动加购开关 0-关 1-开</p>
     */
    public void setAutoRepurchaseSwitch(Long AutoRepurchaseSwitch) {
        this.AutoRepurchaseSwitch = AutoRepurchaseSwitch;
    }

    /**
     * Get <p>合并剩余解绑次数 = (旗舰版total + 专业版total) × 2 - 当月已解绑次数</p> 
     * @return UnbindCountLeft <p>合并剩余解绑次数 = (旗舰版total + 专业版total) × 2 - 当月已解绑次数</p>
     */
    public Long getUnbindCountLeft() {
        return this.UnbindCountLeft;
    }

    /**
     * Set <p>合并剩余解绑次数 = (旗舰版total + 专业版total) × 2 - 当月已解绑次数</p>
     * @param UnbindCountLeft <p>合并剩余解绑次数 = (旗舰版total + 专业版total) × 2 - 当月已解绑次数</p>
     */
    public void setUnbindCountLeft(Long UnbindCountLeft) {
        this.UnbindCountLeft = UnbindCountLeft;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeLicenseStatusResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLicenseStatusResponse(DescribeLicenseStatusResponse source) {
        if (source.List != null) {
            this.List = new LicenseStatusItem[source.List.length];
            for (int i = 0; i < source.List.length; i++) {
                this.List[i] = new LicenseStatusItem(source.List[i]);
            }
        }
        if (source.AutoRepurchaseSwitch != null) {
            this.AutoRepurchaseSwitch = new Long(source.AutoRepurchaseSwitch);
        }
        if (source.UnbindCountLeft != null) {
            this.UnbindCountLeft = new Long(source.UnbindCountLeft);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "List.", this.List);
        this.setParamSimple(map, prefix + "AutoRepurchaseSwitch", this.AutoRepurchaseSwitch);
        this.setParamSimple(map, prefix + "UnbindCountLeft", this.UnbindCountLeft);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

