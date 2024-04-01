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
package com.tencentcloudapi.faceid.v20180301.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetFaceIdRiskInfoResponse extends AbstractModel {

    /**
    * 描述当前请求所在设备的风险标签，详情如下： 01-设备疑似被Root/设备疑似越狱 02-设备疑似被注入 03-设备疑似为模拟器 04-设备疑似存在风险操作 05-摄像头疑似被劫持 06-疑似黑产设备
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeviceInfoTag")
    @Expose
    private String DeviceInfoTag;

    /**
    * 描述当前请求所在设备的风险等级，共4级，详情如下： 1 - 低风险 2 - 中风险 3 - 高风险 4 - 攻击 ，-1表示未获取到风险等级
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeviceInfoLevel")
    @Expose
    private Long DeviceInfoLevel;

    /**
    * 设备id标识
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OpenId")
    @Expose
    private String OpenId;

    /**
    * 描述当前请求所在设备的相机指纹风险等级，共4级，详情如下： 1 - 低风险 2 - 中风险 3 - 高风险 4 - 攻击 ，-1表示未获取到风险等级
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CameraInfoLevel")
    @Expose
    private Long CameraInfoLevel;

    /**
    * 描述当前请求所在设备的相机指纹风险标签，详情如下： 01-设备疑似被Root/设备疑似越狱 02-设备疑似被注入 03-设备疑似为模拟器 04-设备疑似存在风险操作 05-摄像头疑似被劫持 06-疑似黑产设备，空表示没有相机指纹风险
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CameraInfoTag")
    @Expose
    private String CameraInfoTag;

    /**
    * 获取token时透传的信息	
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Extra")
    @Expose
    private String Extra;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 描述当前请求所在设备的风险标签，详情如下： 01-设备疑似被Root/设备疑似越狱 02-设备疑似被注入 03-设备疑似为模拟器 04-设备疑似存在风险操作 05-摄像头疑似被劫持 06-疑似黑产设备
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeviceInfoTag 描述当前请求所在设备的风险标签，详情如下： 01-设备疑似被Root/设备疑似越狱 02-设备疑似被注入 03-设备疑似为模拟器 04-设备疑似存在风险操作 05-摄像头疑似被劫持 06-疑似黑产设备
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDeviceInfoTag() {
        return this.DeviceInfoTag;
    }

    /**
     * Set 描述当前请求所在设备的风险标签，详情如下： 01-设备疑似被Root/设备疑似越狱 02-设备疑似被注入 03-设备疑似为模拟器 04-设备疑似存在风险操作 05-摄像头疑似被劫持 06-疑似黑产设备
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeviceInfoTag 描述当前请求所在设备的风险标签，详情如下： 01-设备疑似被Root/设备疑似越狱 02-设备疑似被注入 03-设备疑似为模拟器 04-设备疑似存在风险操作 05-摄像头疑似被劫持 06-疑似黑产设备
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeviceInfoTag(String DeviceInfoTag) {
        this.DeviceInfoTag = DeviceInfoTag;
    }

    /**
     * Get 描述当前请求所在设备的风险等级，共4级，详情如下： 1 - 低风险 2 - 中风险 3 - 高风险 4 - 攻击 ，-1表示未获取到风险等级
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeviceInfoLevel 描述当前请求所在设备的风险等级，共4级，详情如下： 1 - 低风险 2 - 中风险 3 - 高风险 4 - 攻击 ，-1表示未获取到风险等级
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDeviceInfoLevel() {
        return this.DeviceInfoLevel;
    }

    /**
     * Set 描述当前请求所在设备的风险等级，共4级，详情如下： 1 - 低风险 2 - 中风险 3 - 高风险 4 - 攻击 ，-1表示未获取到风险等级
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeviceInfoLevel 描述当前请求所在设备的风险等级，共4级，详情如下： 1 - 低风险 2 - 中风险 3 - 高风险 4 - 攻击 ，-1表示未获取到风险等级
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeviceInfoLevel(Long DeviceInfoLevel) {
        this.DeviceInfoLevel = DeviceInfoLevel;
    }

    /**
     * Get 设备id标识
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OpenId 设备id标识
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOpenId() {
        return this.OpenId;
    }

    /**
     * Set 设备id标识
注意：此字段可能返回 null，表示取不到有效值。
     * @param OpenId 设备id标识
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOpenId(String OpenId) {
        this.OpenId = OpenId;
    }

    /**
     * Get 描述当前请求所在设备的相机指纹风险等级，共4级，详情如下： 1 - 低风险 2 - 中风险 3 - 高风险 4 - 攻击 ，-1表示未获取到风险等级
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CameraInfoLevel 描述当前请求所在设备的相机指纹风险等级，共4级，详情如下： 1 - 低风险 2 - 中风险 3 - 高风险 4 - 攻击 ，-1表示未获取到风险等级
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCameraInfoLevel() {
        return this.CameraInfoLevel;
    }

    /**
     * Set 描述当前请求所在设备的相机指纹风险等级，共4级，详情如下： 1 - 低风险 2 - 中风险 3 - 高风险 4 - 攻击 ，-1表示未获取到风险等级
注意：此字段可能返回 null，表示取不到有效值。
     * @param CameraInfoLevel 描述当前请求所在设备的相机指纹风险等级，共4级，详情如下： 1 - 低风险 2 - 中风险 3 - 高风险 4 - 攻击 ，-1表示未获取到风险等级
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCameraInfoLevel(Long CameraInfoLevel) {
        this.CameraInfoLevel = CameraInfoLevel;
    }

    /**
     * Get 描述当前请求所在设备的相机指纹风险标签，详情如下： 01-设备疑似被Root/设备疑似越狱 02-设备疑似被注入 03-设备疑似为模拟器 04-设备疑似存在风险操作 05-摄像头疑似被劫持 06-疑似黑产设备，空表示没有相机指纹风险
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CameraInfoTag 描述当前请求所在设备的相机指纹风险标签，详情如下： 01-设备疑似被Root/设备疑似越狱 02-设备疑似被注入 03-设备疑似为模拟器 04-设备疑似存在风险操作 05-摄像头疑似被劫持 06-疑似黑产设备，空表示没有相机指纹风险
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCameraInfoTag() {
        return this.CameraInfoTag;
    }

    /**
     * Set 描述当前请求所在设备的相机指纹风险标签，详情如下： 01-设备疑似被Root/设备疑似越狱 02-设备疑似被注入 03-设备疑似为模拟器 04-设备疑似存在风险操作 05-摄像头疑似被劫持 06-疑似黑产设备，空表示没有相机指纹风险
注意：此字段可能返回 null，表示取不到有效值。
     * @param CameraInfoTag 描述当前请求所在设备的相机指纹风险标签，详情如下： 01-设备疑似被Root/设备疑似越狱 02-设备疑似被注入 03-设备疑似为模拟器 04-设备疑似存在风险操作 05-摄像头疑似被劫持 06-疑似黑产设备，空表示没有相机指纹风险
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCameraInfoTag(String CameraInfoTag) {
        this.CameraInfoTag = CameraInfoTag;
    }

    /**
     * Get 获取token时透传的信息	
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Extra 获取token时透传的信息	
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExtra() {
        return this.Extra;
    }

    /**
     * Set 获取token时透传的信息	
注意：此字段可能返回 null，表示取不到有效值。
     * @param Extra 获取token时透传的信息	
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExtra(String Extra) {
        this.Extra = Extra;
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

    public GetFaceIdRiskInfoResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetFaceIdRiskInfoResponse(GetFaceIdRiskInfoResponse source) {
        if (source.DeviceInfoTag != null) {
            this.DeviceInfoTag = new String(source.DeviceInfoTag);
        }
        if (source.DeviceInfoLevel != null) {
            this.DeviceInfoLevel = new Long(source.DeviceInfoLevel);
        }
        if (source.OpenId != null) {
            this.OpenId = new String(source.OpenId);
        }
        if (source.CameraInfoLevel != null) {
            this.CameraInfoLevel = new Long(source.CameraInfoLevel);
        }
        if (source.CameraInfoTag != null) {
            this.CameraInfoTag = new String(source.CameraInfoTag);
        }
        if (source.Extra != null) {
            this.Extra = new String(source.Extra);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DeviceInfoTag", this.DeviceInfoTag);
        this.setParamSimple(map, prefix + "DeviceInfoLevel", this.DeviceInfoLevel);
        this.setParamSimple(map, prefix + "OpenId", this.OpenId);
        this.setParamSimple(map, prefix + "CameraInfoLevel", this.CameraInfoLevel);
        this.setParamSimple(map, prefix + "CameraInfoTag", this.CameraInfoTag);
        this.setParamSimple(map, prefix + "Extra", this.Extra);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

