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
package com.tencentcloudapi.ioa.v20220601.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyDeviceTrustStatusRequest extends AbstractModel {

    /**
    * <p>设备状态，1表示拉黑，0表示加白</p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>设备MID列表</p>
    */
    @SerializedName("DeviceIDList")
    @Expose
    private String [] DeviceIDList;

    /**
    * <p>设备拉黑有效期，UnixTime, 单位是 ms,0表示永久有效，默认值是0</p>
    */
    @SerializedName("BlackStatusDeadline")
    @Expose
    private Long BlackStatusDeadline;

    /**
    * <p>DescribeAccuserList返回的Id 列表</p>
    */
    @SerializedName("IdList")
    @Expose
    private Long [] IdList;

    /**
    * <p>默认值：0，根据id更新，1根据DeviceIDList</p>
    */
    @SerializedName("UpdateFlags")
    @Expose
    private Long UpdateFlags;

    /**
     * Get <p>设备状态，1表示拉黑，0表示加白</p> 
     * @return Status <p>设备状态，1表示拉黑，0表示加白</p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>设备状态，1表示拉黑，0表示加白</p>
     * @param Status <p>设备状态，1表示拉黑，0表示加白</p>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>设备MID列表</p> 
     * @return DeviceIDList <p>设备MID列表</p>
     */
    public String [] getDeviceIDList() {
        return this.DeviceIDList;
    }

    /**
     * Set <p>设备MID列表</p>
     * @param DeviceIDList <p>设备MID列表</p>
     */
    public void setDeviceIDList(String [] DeviceIDList) {
        this.DeviceIDList = DeviceIDList;
    }

    /**
     * Get <p>设备拉黑有效期，UnixTime, 单位是 ms,0表示永久有效，默认值是0</p> 
     * @return BlackStatusDeadline <p>设备拉黑有效期，UnixTime, 单位是 ms,0表示永久有效，默认值是0</p>
     */
    public Long getBlackStatusDeadline() {
        return this.BlackStatusDeadline;
    }

    /**
     * Set <p>设备拉黑有效期，UnixTime, 单位是 ms,0表示永久有效，默认值是0</p>
     * @param BlackStatusDeadline <p>设备拉黑有效期，UnixTime, 单位是 ms,0表示永久有效，默认值是0</p>
     */
    public void setBlackStatusDeadline(Long BlackStatusDeadline) {
        this.BlackStatusDeadline = BlackStatusDeadline;
    }

    /**
     * Get <p>DescribeAccuserList返回的Id 列表</p> 
     * @return IdList <p>DescribeAccuserList返回的Id 列表</p>
     */
    public Long [] getIdList() {
        return this.IdList;
    }

    /**
     * Set <p>DescribeAccuserList返回的Id 列表</p>
     * @param IdList <p>DescribeAccuserList返回的Id 列表</p>
     */
    public void setIdList(Long [] IdList) {
        this.IdList = IdList;
    }

    /**
     * Get <p>默认值：0，根据id更新，1根据DeviceIDList</p> 
     * @return UpdateFlags <p>默认值：0，根据id更新，1根据DeviceIDList</p>
     */
    public Long getUpdateFlags() {
        return this.UpdateFlags;
    }

    /**
     * Set <p>默认值：0，根据id更新，1根据DeviceIDList</p>
     * @param UpdateFlags <p>默认值：0，根据id更新，1根据DeviceIDList</p>
     */
    public void setUpdateFlags(Long UpdateFlags) {
        this.UpdateFlags = UpdateFlags;
    }

    public ModifyDeviceTrustStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDeviceTrustStatusRequest(ModifyDeviceTrustStatusRequest source) {
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.DeviceIDList != null) {
            this.DeviceIDList = new String[source.DeviceIDList.length];
            for (int i = 0; i < source.DeviceIDList.length; i++) {
                this.DeviceIDList[i] = new String(source.DeviceIDList[i]);
            }
        }
        if (source.BlackStatusDeadline != null) {
            this.BlackStatusDeadline = new Long(source.BlackStatusDeadline);
        }
        if (source.IdList != null) {
            this.IdList = new Long[source.IdList.length];
            for (int i = 0; i < source.IdList.length; i++) {
                this.IdList[i] = new Long(source.IdList[i]);
            }
        }
        if (source.UpdateFlags != null) {
            this.UpdateFlags = new Long(source.UpdateFlags);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArraySimple(map, prefix + "DeviceIDList.", this.DeviceIDList);
        this.setParamSimple(map, prefix + "BlackStatusDeadline", this.BlackStatusDeadline);
        this.setParamArraySimple(map, prefix + "IdList.", this.IdList);
        this.setParamSimple(map, prefix + "UpdateFlags", this.UpdateFlags);

    }
}

