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
package com.tencentcloudapi.gs.v20191118.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AndroidInstance extends AbstractModel {

    /**
    * <p>实例 ID</p>
    */
    @SerializedName("AndroidInstanceId")
    @Expose
    private String AndroidInstanceId;

    /**
    * <p>实例所在区域</p>
    */
    @SerializedName("AndroidInstanceRegion")
    @Expose
    private String AndroidInstanceRegion;

    /**
    * <p>实例可用区</p>
    */
    @SerializedName("AndroidInstanceZone")
    @Expose
    private String AndroidInstanceZone;

    /**
    * <p>实例状态：INITIALIZING，NORMAL，PROCESSING</p>
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * <p>实例规格</p>
    */
    @SerializedName("AndroidInstanceType")
    @Expose
    private String AndroidInstanceType;

    /**
    * <p>实例镜像 ID</p>
    */
    @SerializedName("AndroidInstanceImageId")
    @Expose
    private String AndroidInstanceImageId;

    /**
    * <p>分辨率宽度</p>
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * <p>分辨率高度</p>
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
    * <p>每英寸像素点。</p>
    */
    @SerializedName("DPI")
    @Expose
    private Long DPI;

    /**
    * <p>帧率</p>
    */
    @SerializedName("FPS")
    @Expose
    private Long FPS;

    /**
    * <p>宿主机 ID</p>
    */
    @SerializedName("HostSerialNumber")
    @Expose
    private String HostSerialNumber;

    /**
    * <p>分组 ID</p>
    */
    @SerializedName("AndroidInstanceGroupId")
    @Expose
    private String AndroidInstanceGroupId;

    /**
    * <p>标签列表</p>
    */
    @SerializedName("AndroidInstanceLabels")
    @Expose
    private AndroidInstanceLabel [] AndroidInstanceLabels;

    /**
    * <p>名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>用户ID</p>
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * <p>内网 IP</p>
    */
    @SerializedName("PrivateIP")
    @Expose
    private String PrivateIP;

    /**
    * <p>创建时间</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>机箱 ID</p>
    */
    @SerializedName("HostServerSerialNumber")
    @Expose
    private String HostServerSerialNumber;

    /**
    * <p>服务状态。<br>IDLE：未连接<br>ESTABLISHED：连接中</p>
    */
    @SerializedName("ServiceStatus")
    @Expose
    private String ServiceStatus;

    /**
    * <p>安卓实例型号。<br>YS1：默认值，基础型云手机<br>GC0、GC1、GC2：三种性能型云手机</p>
    */
    @SerializedName("AndroidInstanceModel")
    @Expose
    private String AndroidInstanceModel;

    /**
     * Get <p>实例 ID</p> 
     * @return AndroidInstanceId <p>实例 ID</p>
     */
    public String getAndroidInstanceId() {
        return this.AndroidInstanceId;
    }

    /**
     * Set <p>实例 ID</p>
     * @param AndroidInstanceId <p>实例 ID</p>
     */
    public void setAndroidInstanceId(String AndroidInstanceId) {
        this.AndroidInstanceId = AndroidInstanceId;
    }

    /**
     * Get <p>实例所在区域</p> 
     * @return AndroidInstanceRegion <p>实例所在区域</p>
     */
    public String getAndroidInstanceRegion() {
        return this.AndroidInstanceRegion;
    }

    /**
     * Set <p>实例所在区域</p>
     * @param AndroidInstanceRegion <p>实例所在区域</p>
     */
    public void setAndroidInstanceRegion(String AndroidInstanceRegion) {
        this.AndroidInstanceRegion = AndroidInstanceRegion;
    }

    /**
     * Get <p>实例可用区</p> 
     * @return AndroidInstanceZone <p>实例可用区</p>
     */
    public String getAndroidInstanceZone() {
        return this.AndroidInstanceZone;
    }

    /**
     * Set <p>实例可用区</p>
     * @param AndroidInstanceZone <p>实例可用区</p>
     */
    public void setAndroidInstanceZone(String AndroidInstanceZone) {
        this.AndroidInstanceZone = AndroidInstanceZone;
    }

    /**
     * Get <p>实例状态：INITIALIZING，NORMAL，PROCESSING</p> 
     * @return State <p>实例状态：INITIALIZING，NORMAL，PROCESSING</p>
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set <p>实例状态：INITIALIZING，NORMAL，PROCESSING</p>
     * @param State <p>实例状态：INITIALIZING，NORMAL，PROCESSING</p>
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get <p>实例规格</p> 
     * @return AndroidInstanceType <p>实例规格</p>
     */
    public String getAndroidInstanceType() {
        return this.AndroidInstanceType;
    }

    /**
     * Set <p>实例规格</p>
     * @param AndroidInstanceType <p>实例规格</p>
     */
    public void setAndroidInstanceType(String AndroidInstanceType) {
        this.AndroidInstanceType = AndroidInstanceType;
    }

    /**
     * Get <p>实例镜像 ID</p> 
     * @return AndroidInstanceImageId <p>实例镜像 ID</p>
     */
    public String getAndroidInstanceImageId() {
        return this.AndroidInstanceImageId;
    }

    /**
     * Set <p>实例镜像 ID</p>
     * @param AndroidInstanceImageId <p>实例镜像 ID</p>
     */
    public void setAndroidInstanceImageId(String AndroidInstanceImageId) {
        this.AndroidInstanceImageId = AndroidInstanceImageId;
    }

    /**
     * Get <p>分辨率宽度</p> 
     * @return Width <p>分辨率宽度</p>
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set <p>分辨率宽度</p>
     * @param Width <p>分辨率宽度</p>
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get <p>分辨率高度</p> 
     * @return Height <p>分辨率高度</p>
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set <p>分辨率高度</p>
     * @param Height <p>分辨率高度</p>
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    /**
     * Get <p>每英寸像素点。</p> 
     * @return DPI <p>每英寸像素点。</p>
     */
    public Long getDPI() {
        return this.DPI;
    }

    /**
     * Set <p>每英寸像素点。</p>
     * @param DPI <p>每英寸像素点。</p>
     */
    public void setDPI(Long DPI) {
        this.DPI = DPI;
    }

    /**
     * Get <p>帧率</p> 
     * @return FPS <p>帧率</p>
     */
    public Long getFPS() {
        return this.FPS;
    }

    /**
     * Set <p>帧率</p>
     * @param FPS <p>帧率</p>
     */
    public void setFPS(Long FPS) {
        this.FPS = FPS;
    }

    /**
     * Get <p>宿主机 ID</p> 
     * @return HostSerialNumber <p>宿主机 ID</p>
     */
    public String getHostSerialNumber() {
        return this.HostSerialNumber;
    }

    /**
     * Set <p>宿主机 ID</p>
     * @param HostSerialNumber <p>宿主机 ID</p>
     */
    public void setHostSerialNumber(String HostSerialNumber) {
        this.HostSerialNumber = HostSerialNumber;
    }

    /**
     * Get <p>分组 ID</p> 
     * @return AndroidInstanceGroupId <p>分组 ID</p>
     */
    public String getAndroidInstanceGroupId() {
        return this.AndroidInstanceGroupId;
    }

    /**
     * Set <p>分组 ID</p>
     * @param AndroidInstanceGroupId <p>分组 ID</p>
     */
    public void setAndroidInstanceGroupId(String AndroidInstanceGroupId) {
        this.AndroidInstanceGroupId = AndroidInstanceGroupId;
    }

    /**
     * Get <p>标签列表</p> 
     * @return AndroidInstanceLabels <p>标签列表</p>
     */
    public AndroidInstanceLabel [] getAndroidInstanceLabels() {
        return this.AndroidInstanceLabels;
    }

    /**
     * Set <p>标签列表</p>
     * @param AndroidInstanceLabels <p>标签列表</p>
     */
    public void setAndroidInstanceLabels(AndroidInstanceLabel [] AndroidInstanceLabels) {
        this.AndroidInstanceLabels = AndroidInstanceLabels;
    }

    /**
     * Get <p>名称</p> 
     * @return Name <p>名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>名称</p>
     * @param Name <p>名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>用户ID</p> 
     * @return UserId <p>用户ID</p>
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set <p>用户ID</p>
     * @param UserId <p>用户ID</p>
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get <p>内网 IP</p> 
     * @return PrivateIP <p>内网 IP</p>
     */
    public String getPrivateIP() {
        return this.PrivateIP;
    }

    /**
     * Set <p>内网 IP</p>
     * @param PrivateIP <p>内网 IP</p>
     */
    public void setPrivateIP(String PrivateIP) {
        this.PrivateIP = PrivateIP;
    }

    /**
     * Get <p>创建时间</p> 
     * @return CreateTime <p>创建时间</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间</p>
     * @param CreateTime <p>创建时间</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>机箱 ID</p> 
     * @return HostServerSerialNumber <p>机箱 ID</p>
     */
    public String getHostServerSerialNumber() {
        return this.HostServerSerialNumber;
    }

    /**
     * Set <p>机箱 ID</p>
     * @param HostServerSerialNumber <p>机箱 ID</p>
     */
    public void setHostServerSerialNumber(String HostServerSerialNumber) {
        this.HostServerSerialNumber = HostServerSerialNumber;
    }

    /**
     * Get <p>服务状态。<br>IDLE：未连接<br>ESTABLISHED：连接中</p> 
     * @return ServiceStatus <p>服务状态。<br>IDLE：未连接<br>ESTABLISHED：连接中</p>
     */
    public String getServiceStatus() {
        return this.ServiceStatus;
    }

    /**
     * Set <p>服务状态。<br>IDLE：未连接<br>ESTABLISHED：连接中</p>
     * @param ServiceStatus <p>服务状态。<br>IDLE：未连接<br>ESTABLISHED：连接中</p>
     */
    public void setServiceStatus(String ServiceStatus) {
        this.ServiceStatus = ServiceStatus;
    }

    /**
     * Get <p>安卓实例型号。<br>YS1：默认值，基础型云手机<br>GC0、GC1、GC2：三种性能型云手机</p> 
     * @return AndroidInstanceModel <p>安卓实例型号。<br>YS1：默认值，基础型云手机<br>GC0、GC1、GC2：三种性能型云手机</p>
     */
    public String getAndroidInstanceModel() {
        return this.AndroidInstanceModel;
    }

    /**
     * Set <p>安卓实例型号。<br>YS1：默认值，基础型云手机<br>GC0、GC1、GC2：三种性能型云手机</p>
     * @param AndroidInstanceModel <p>安卓实例型号。<br>YS1：默认值，基础型云手机<br>GC0、GC1、GC2：三种性能型云手机</p>
     */
    public void setAndroidInstanceModel(String AndroidInstanceModel) {
        this.AndroidInstanceModel = AndroidInstanceModel;
    }

    public AndroidInstance() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AndroidInstance(AndroidInstance source) {
        if (source.AndroidInstanceId != null) {
            this.AndroidInstanceId = new String(source.AndroidInstanceId);
        }
        if (source.AndroidInstanceRegion != null) {
            this.AndroidInstanceRegion = new String(source.AndroidInstanceRegion);
        }
        if (source.AndroidInstanceZone != null) {
            this.AndroidInstanceZone = new String(source.AndroidInstanceZone);
        }
        if (source.State != null) {
            this.State = new String(source.State);
        }
        if (source.AndroidInstanceType != null) {
            this.AndroidInstanceType = new String(source.AndroidInstanceType);
        }
        if (source.AndroidInstanceImageId != null) {
            this.AndroidInstanceImageId = new String(source.AndroidInstanceImageId);
        }
        if (source.Width != null) {
            this.Width = new Long(source.Width);
        }
        if (source.Height != null) {
            this.Height = new Long(source.Height);
        }
        if (source.DPI != null) {
            this.DPI = new Long(source.DPI);
        }
        if (source.FPS != null) {
            this.FPS = new Long(source.FPS);
        }
        if (source.HostSerialNumber != null) {
            this.HostSerialNumber = new String(source.HostSerialNumber);
        }
        if (source.AndroidInstanceGroupId != null) {
            this.AndroidInstanceGroupId = new String(source.AndroidInstanceGroupId);
        }
        if (source.AndroidInstanceLabels != null) {
            this.AndroidInstanceLabels = new AndroidInstanceLabel[source.AndroidInstanceLabels.length];
            for (int i = 0; i < source.AndroidInstanceLabels.length; i++) {
                this.AndroidInstanceLabels[i] = new AndroidInstanceLabel(source.AndroidInstanceLabels[i]);
            }
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.PrivateIP != null) {
            this.PrivateIP = new String(source.PrivateIP);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.HostServerSerialNumber != null) {
            this.HostServerSerialNumber = new String(source.HostServerSerialNumber);
        }
        if (source.ServiceStatus != null) {
            this.ServiceStatus = new String(source.ServiceStatus);
        }
        if (source.AndroidInstanceModel != null) {
            this.AndroidInstanceModel = new String(source.AndroidInstanceModel);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AndroidInstanceId", this.AndroidInstanceId);
        this.setParamSimple(map, prefix + "AndroidInstanceRegion", this.AndroidInstanceRegion);
        this.setParamSimple(map, prefix + "AndroidInstanceZone", this.AndroidInstanceZone);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "AndroidInstanceType", this.AndroidInstanceType);
        this.setParamSimple(map, prefix + "AndroidInstanceImageId", this.AndroidInstanceImageId);
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "Height", this.Height);
        this.setParamSimple(map, prefix + "DPI", this.DPI);
        this.setParamSimple(map, prefix + "FPS", this.FPS);
        this.setParamSimple(map, prefix + "HostSerialNumber", this.HostSerialNumber);
        this.setParamSimple(map, prefix + "AndroidInstanceGroupId", this.AndroidInstanceGroupId);
        this.setParamArrayObj(map, prefix + "AndroidInstanceLabels.", this.AndroidInstanceLabels);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "PrivateIP", this.PrivateIP);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "HostServerSerialNumber", this.HostServerSerialNumber);
        this.setParamSimple(map, prefix + "ServiceStatus", this.ServiceStatus);
        this.setParamSimple(map, prefix + "AndroidInstanceModel", this.AndroidInstanceModel);

    }
}

