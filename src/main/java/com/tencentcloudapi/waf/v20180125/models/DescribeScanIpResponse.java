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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeScanIpResponse extends AbstractModel {

    /**
    * ip列表,当入参Ip为all时，返回该值
    */
    @SerializedName("IpList")
    @Expose
    private ScanIpInfo [] IpList;

    /**
    * 所属业务
    */
    @SerializedName("Bussiness")
    @Expose
    private String Bussiness;

    /**
    * 业务特征
    */
    @SerializedName("Characteristic")
    @Expose
    private String Characteristic;

    /**
    * 扫描说明
    */
    @SerializedName("Descibe")
    @Expose
    private String Descibe;

    /**
    * 官方公告
    */
    @SerializedName("Referer")
    @Expose
    private String Referer;

    /**
    * 扫描示例
    */
    @SerializedName("Demo")
    @Expose
    private String Demo;

    /**
    * 扫描对象
    */
    @SerializedName("Target")
    @Expose
    private String Target;

    /**
    * 扫描目的
    */
    @SerializedName("Purpose")
    @Expose
    private String Purpose;

    /**
    * 产品文案
    */
    @SerializedName("Announcement")
    @Expose
    private String Announcement;

    /**
    * 更新时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
    * ipowner
    */
    @SerializedName("IpOwner")
    @Expose
    private String IpOwner;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get ip列表,当入参Ip为all时，返回该值 
     * @return IpList ip列表,当入参Ip为all时，返回该值
     */
    public ScanIpInfo [] getIpList() {
        return this.IpList;
    }

    /**
     * Set ip列表,当入参Ip为all时，返回该值
     * @param IpList ip列表,当入参Ip为all时，返回该值
     */
    public void setIpList(ScanIpInfo [] IpList) {
        this.IpList = IpList;
    }

    /**
     * Get 所属业务 
     * @return Bussiness 所属业务
     */
    public String getBussiness() {
        return this.Bussiness;
    }

    /**
     * Set 所属业务
     * @param Bussiness 所属业务
     */
    public void setBussiness(String Bussiness) {
        this.Bussiness = Bussiness;
    }

    /**
     * Get 业务特征 
     * @return Characteristic 业务特征
     */
    public String getCharacteristic() {
        return this.Characteristic;
    }

    /**
     * Set 业务特征
     * @param Characteristic 业务特征
     */
    public void setCharacteristic(String Characteristic) {
        this.Characteristic = Characteristic;
    }

    /**
     * Get 扫描说明 
     * @return Descibe 扫描说明
     */
    public String getDescibe() {
        return this.Descibe;
    }

    /**
     * Set 扫描说明
     * @param Descibe 扫描说明
     */
    public void setDescibe(String Descibe) {
        this.Descibe = Descibe;
    }

    /**
     * Get 官方公告 
     * @return Referer 官方公告
     */
    public String getReferer() {
        return this.Referer;
    }

    /**
     * Set 官方公告
     * @param Referer 官方公告
     */
    public void setReferer(String Referer) {
        this.Referer = Referer;
    }

    /**
     * Get 扫描示例 
     * @return Demo 扫描示例
     */
    public String getDemo() {
        return this.Demo;
    }

    /**
     * Set 扫描示例
     * @param Demo 扫描示例
     */
    public void setDemo(String Demo) {
        this.Demo = Demo;
    }

    /**
     * Get 扫描对象 
     * @return Target 扫描对象
     */
    public String getTarget() {
        return this.Target;
    }

    /**
     * Set 扫描对象
     * @param Target 扫描对象
     */
    public void setTarget(String Target) {
        this.Target = Target;
    }

    /**
     * Get 扫描目的 
     * @return Purpose 扫描目的
     */
    public String getPurpose() {
        return this.Purpose;
    }

    /**
     * Set 扫描目的
     * @param Purpose 扫描目的
     */
    public void setPurpose(String Purpose) {
        this.Purpose = Purpose;
    }

    /**
     * Get 产品文案 
     * @return Announcement 产品文案
     */
    public String getAnnouncement() {
        return this.Announcement;
    }

    /**
     * Set 产品文案
     * @param Announcement 产品文案
     */
    public void setAnnouncement(String Announcement) {
        this.Announcement = Announcement;
    }

    /**
     * Get 更新时间 
     * @return UpdateTime 更新时间
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间
     * @param UpdateTime 更新时间
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get ipowner 
     * @return IpOwner ipowner
     */
    public String getIpOwner() {
        return this.IpOwner;
    }

    /**
     * Set ipowner
     * @param IpOwner ipowner
     */
    public void setIpOwner(String IpOwner) {
        this.IpOwner = IpOwner;
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

    public DescribeScanIpResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeScanIpResponse(DescribeScanIpResponse source) {
        if (source.IpList != null) {
            this.IpList = new ScanIpInfo[source.IpList.length];
            for (int i = 0; i < source.IpList.length; i++) {
                this.IpList[i] = new ScanIpInfo(source.IpList[i]);
            }
        }
        if (source.Bussiness != null) {
            this.Bussiness = new String(source.Bussiness);
        }
        if (source.Characteristic != null) {
            this.Characteristic = new String(source.Characteristic);
        }
        if (source.Descibe != null) {
            this.Descibe = new String(source.Descibe);
        }
        if (source.Referer != null) {
            this.Referer = new String(source.Referer);
        }
        if (source.Demo != null) {
            this.Demo = new String(source.Demo);
        }
        if (source.Target != null) {
            this.Target = new String(source.Target);
        }
        if (source.Purpose != null) {
            this.Purpose = new String(source.Purpose);
        }
        if (source.Announcement != null) {
            this.Announcement = new String(source.Announcement);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new Long(source.UpdateTime);
        }
        if (source.IpOwner != null) {
            this.IpOwner = new String(source.IpOwner);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "IpList.", this.IpList);
        this.setParamSimple(map, prefix + "Bussiness", this.Bussiness);
        this.setParamSimple(map, prefix + "Characteristic", this.Characteristic);
        this.setParamSimple(map, prefix + "Descibe", this.Descibe);
        this.setParamSimple(map, prefix + "Referer", this.Referer);
        this.setParamSimple(map, prefix + "Demo", this.Demo);
        this.setParamSimple(map, prefix + "Target", this.Target);
        this.setParamSimple(map, prefix + "Purpose", this.Purpose);
        this.setParamSimple(map, prefix + "Announcement", this.Announcement);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "IpOwner", this.IpOwner);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

