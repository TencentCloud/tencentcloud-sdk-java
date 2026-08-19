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

public class DescribeCWPScanIpInfoResponse extends AbstractModel {

    /**
    * <p>所属业务</p>
    */
    @SerializedName("Bussiness")
    @Expose
    private String Bussiness;

    /**
    * <p>业务特征</p>
    */
    @SerializedName("Characteristic")
    @Expose
    private String Characteristic;

    /**
    * <p>描述</p>
    */
    @SerializedName("Describe")
    @Expose
    private String Describe;

    /**
    * <p>官方公告</p>
    */
    @SerializedName("Referer")
    @Expose
    private String Referer;

    /**
    * <p>扫描示例</p>
    */
    @SerializedName("Demo")
    @Expose
    private String Demo;

    /**
    * <p>扫描对象</p>
    */
    @SerializedName("Target")
    @Expose
    private String Target;

    /**
    * <p>扫描目的</p>
    */
    @SerializedName("Purpose")
    @Expose
    private String Purpose;

    /**
    * <p>产品文案</p>
    */
    @SerializedName("Announcement")
    @Expose
    private String Announcement;

    /**
    * <p>地理位置</p>
    */
    @SerializedName("Location")
    @Expose
    private String Location;

    /**
    * <p>所属运营商</p>
    */
    @SerializedName("ISP")
    @Expose
    private String ISP;

    /**
    * <p>是否归属于腾讯</p>
    */
    @SerializedName("IsBelongTencent")
    @Expose
    private Boolean IsBelongTencent;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>所属业务</p> 
     * @return Bussiness <p>所属业务</p>
     */
    public String getBussiness() {
        return this.Bussiness;
    }

    /**
     * Set <p>所属业务</p>
     * @param Bussiness <p>所属业务</p>
     */
    public void setBussiness(String Bussiness) {
        this.Bussiness = Bussiness;
    }

    /**
     * Get <p>业务特征</p> 
     * @return Characteristic <p>业务特征</p>
     */
    public String getCharacteristic() {
        return this.Characteristic;
    }

    /**
     * Set <p>业务特征</p>
     * @param Characteristic <p>业务特征</p>
     */
    public void setCharacteristic(String Characteristic) {
        this.Characteristic = Characteristic;
    }

    /**
     * Get <p>描述</p> 
     * @return Describe <p>描述</p>
     */
    public String getDescribe() {
        return this.Describe;
    }

    /**
     * Set <p>描述</p>
     * @param Describe <p>描述</p>
     */
    public void setDescribe(String Describe) {
        this.Describe = Describe;
    }

    /**
     * Get <p>官方公告</p> 
     * @return Referer <p>官方公告</p>
     */
    public String getReferer() {
        return this.Referer;
    }

    /**
     * Set <p>官方公告</p>
     * @param Referer <p>官方公告</p>
     */
    public void setReferer(String Referer) {
        this.Referer = Referer;
    }

    /**
     * Get <p>扫描示例</p> 
     * @return Demo <p>扫描示例</p>
     */
    public String getDemo() {
        return this.Demo;
    }

    /**
     * Set <p>扫描示例</p>
     * @param Demo <p>扫描示例</p>
     */
    public void setDemo(String Demo) {
        this.Demo = Demo;
    }

    /**
     * Get <p>扫描对象</p> 
     * @return Target <p>扫描对象</p>
     */
    public String getTarget() {
        return this.Target;
    }

    /**
     * Set <p>扫描对象</p>
     * @param Target <p>扫描对象</p>
     */
    public void setTarget(String Target) {
        this.Target = Target;
    }

    /**
     * Get <p>扫描目的</p> 
     * @return Purpose <p>扫描目的</p>
     */
    public String getPurpose() {
        return this.Purpose;
    }

    /**
     * Set <p>扫描目的</p>
     * @param Purpose <p>扫描目的</p>
     */
    public void setPurpose(String Purpose) {
        this.Purpose = Purpose;
    }

    /**
     * Get <p>产品文案</p> 
     * @return Announcement <p>产品文案</p>
     */
    public String getAnnouncement() {
        return this.Announcement;
    }

    /**
     * Set <p>产品文案</p>
     * @param Announcement <p>产品文案</p>
     */
    public void setAnnouncement(String Announcement) {
        this.Announcement = Announcement;
    }

    /**
     * Get <p>地理位置</p> 
     * @return Location <p>地理位置</p>
     */
    public String getLocation() {
        return this.Location;
    }

    /**
     * Set <p>地理位置</p>
     * @param Location <p>地理位置</p>
     */
    public void setLocation(String Location) {
        this.Location = Location;
    }

    /**
     * Get <p>所属运营商</p> 
     * @return ISP <p>所属运营商</p>
     */
    public String getISP() {
        return this.ISP;
    }

    /**
     * Set <p>所属运营商</p>
     * @param ISP <p>所属运营商</p>
     */
    public void setISP(String ISP) {
        this.ISP = ISP;
    }

    /**
     * Get <p>是否归属于腾讯</p> 
     * @return IsBelongTencent <p>是否归属于腾讯</p>
     */
    public Boolean getIsBelongTencent() {
        return this.IsBelongTencent;
    }

    /**
     * Set <p>是否归属于腾讯</p>
     * @param IsBelongTencent <p>是否归属于腾讯</p>
     */
    public void setIsBelongTencent(Boolean IsBelongTencent) {
        this.IsBelongTencent = IsBelongTencent;
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

    public DescribeCWPScanIpInfoResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCWPScanIpInfoResponse(DescribeCWPScanIpInfoResponse source) {
        if (source.Bussiness != null) {
            this.Bussiness = new String(source.Bussiness);
        }
        if (source.Characteristic != null) {
            this.Characteristic = new String(source.Characteristic);
        }
        if (source.Describe != null) {
            this.Describe = new String(source.Describe);
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
        if (source.Location != null) {
            this.Location = new String(source.Location);
        }
        if (source.ISP != null) {
            this.ISP = new String(source.ISP);
        }
        if (source.IsBelongTencent != null) {
            this.IsBelongTencent = new Boolean(source.IsBelongTencent);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Bussiness", this.Bussiness);
        this.setParamSimple(map, prefix + "Characteristic", this.Characteristic);
        this.setParamSimple(map, prefix + "Describe", this.Describe);
        this.setParamSimple(map, prefix + "Referer", this.Referer);
        this.setParamSimple(map, prefix + "Demo", this.Demo);
        this.setParamSimple(map, prefix + "Target", this.Target);
        this.setParamSimple(map, prefix + "Purpose", this.Purpose);
        this.setParamSimple(map, prefix + "Announcement", this.Announcement);
        this.setParamSimple(map, prefix + "Location", this.Location);
        this.setParamSimple(map, prefix + "ISP", this.ISP);
        this.setParamSimple(map, prefix + "IsBelongTencent", this.IsBelongTencent);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

