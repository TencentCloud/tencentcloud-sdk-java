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
package com.tencentcloudapi.iotexplorer.v20190423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeviceResult extends AbstractModel {

    /**
    * <p>设备名称</p>
    */
    @SerializedName("DeviceName")
    @Expose
    private String DeviceName;

    /**
    * <p>设备状态</p><p>枚举值：</p><ul><li>SUCCESS： 下发成功    </li><li>PENDING： 存入离线存储</li><li>OFFLINE： 设备离线</li><li>FAILED： 下发失败</li><li>TIMEOUT： 下发超时</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>错误码</p>
    */
    @SerializedName("ErrCode")
    @Expose
    private Long ErrCode;

    /**
    * <p>错误信息</p>
    */
    @SerializedName("ErrMsg")
    @Expose
    private String ErrMsg;

    /**
     * Get <p>设备名称</p> 
     * @return DeviceName <p>设备名称</p>
     */
    public String getDeviceName() {
        return this.DeviceName;
    }

    /**
     * Set <p>设备名称</p>
     * @param DeviceName <p>设备名称</p>
     */
    public void setDeviceName(String DeviceName) {
        this.DeviceName = DeviceName;
    }

    /**
     * Get <p>设备状态</p><p>枚举值：</p><ul><li>SUCCESS： 下发成功    </li><li>PENDING： 存入离线存储</li><li>OFFLINE： 设备离线</li><li>FAILED： 下发失败</li><li>TIMEOUT： 下发超时</li></ul> 
     * @return Status <p>设备状态</p><p>枚举值：</p><ul><li>SUCCESS： 下发成功    </li><li>PENDING： 存入离线存储</li><li>OFFLINE： 设备离线</li><li>FAILED： 下发失败</li><li>TIMEOUT： 下发超时</li></ul>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>设备状态</p><p>枚举值：</p><ul><li>SUCCESS： 下发成功    </li><li>PENDING： 存入离线存储</li><li>OFFLINE： 设备离线</li><li>FAILED： 下发失败</li><li>TIMEOUT： 下发超时</li></ul>
     * @param Status <p>设备状态</p><p>枚举值：</p><ul><li>SUCCESS： 下发成功    </li><li>PENDING： 存入离线存储</li><li>OFFLINE： 设备离线</li><li>FAILED： 下发失败</li><li>TIMEOUT： 下发超时</li></ul>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>错误码</p> 
     * @return ErrCode <p>错误码</p>
     */
    public Long getErrCode() {
        return this.ErrCode;
    }

    /**
     * Set <p>错误码</p>
     * @param ErrCode <p>错误码</p>
     */
    public void setErrCode(Long ErrCode) {
        this.ErrCode = ErrCode;
    }

    /**
     * Get <p>错误信息</p> 
     * @return ErrMsg <p>错误信息</p>
     */
    public String getErrMsg() {
        return this.ErrMsg;
    }

    /**
     * Set <p>错误信息</p>
     * @param ErrMsg <p>错误信息</p>
     */
    public void setErrMsg(String ErrMsg) {
        this.ErrMsg = ErrMsg;
    }

    public DeviceResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeviceResult(DeviceResult source) {
        if (source.DeviceName != null) {
            this.DeviceName = new String(source.DeviceName);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.ErrCode != null) {
            this.ErrCode = new Long(source.ErrCode);
        }
        if (source.ErrMsg != null) {
            this.ErrMsg = new String(source.ErrMsg);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DeviceName", this.DeviceName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ErrCode", this.ErrCode);
        this.setParamSimple(map, prefix + "ErrMsg", this.ErrMsg);

    }
}

