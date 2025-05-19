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
package com.tencentcloudapi.gs.v20191118.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AndroidInstance extends AbstractModel {

    /**
    * 实例 ID
    */
    @SerializedName("AndroidInstanceId")
    @Expose
    private String AndroidInstanceId;

    /**
    * 实例所在区域
    */
    @SerializedName("AndroidInstanceRegion")
    @Expose
    private String AndroidInstanceRegion;

    /**
    * 实例可用区
    */
    @SerializedName("AndroidInstanceZone")
    @Expose
    private String AndroidInstanceZone;

    /**
    * 实例状态：INITIALIZING，NORMAL，PROCESSING
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * 实例规格
    */
    @SerializedName("AndroidInstanceType")
    @Expose
    private String AndroidInstanceType;

    /**
    * 实例镜像 ID
    */
    @SerializedName("AndroidInstanceImageId")
    @Expose
    private String AndroidInstanceImageId;

    /**
    * 分辨率宽度
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * 分辨率高度
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
    * 宿主机 ID
    */
    @SerializedName("HostSerialNumber")
    @Expose
    private String HostSerialNumber;

    /**
    * 分组 ID
    */
    @SerializedName("AndroidInstanceGroupId")
    @Expose
    private String AndroidInstanceGroupId;

    /**
    * 标签列表
    */
    @SerializedName("AndroidInstanceLabels")
    @Expose
    private AndroidInstanceLabel [] AndroidInstanceLabels;

    /**
    * 名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 用户ID
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * 内网 IP
    */
    @SerializedName("PrivateIP")
    @Expose
    private String PrivateIP;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 机箱 ID
    */
    @SerializedName("HostServerSerialNumber")
    @Expose
    private String HostServerSerialNumber;

    /**
     * Get 实例 ID 
     * @return AndroidInstanceId 实例 ID
     */
    public String getAndroidInstanceId() {
        return this.AndroidInstanceId;
    }

    /**
     * Set 实例 ID
     * @param AndroidInstanceId 实例 ID
     */
    public void setAndroidInstanceId(String AndroidInstanceId) {
        this.AndroidInstanceId = AndroidInstanceId;
    }

    /**
     * Get 实例所在区域 
     * @return AndroidInstanceRegion 实例所在区域
     */
    public String getAndroidInstanceRegion() {
        return this.AndroidInstanceRegion;
    }

    /**
     * Set 实例所在区域
     * @param AndroidInstanceRegion 实例所在区域
     */
    public void setAndroidInstanceRegion(String AndroidInstanceRegion) {
        this.AndroidInstanceRegion = AndroidInstanceRegion;
    }

    /**
     * Get 实例可用区 
     * @return AndroidInstanceZone 实例可用区
     */
    public String getAndroidInstanceZone() {
        return this.AndroidInstanceZone;
    }

    /**
     * Set 实例可用区
     * @param AndroidInstanceZone 实例可用区
     */
    public void setAndroidInstanceZone(String AndroidInstanceZone) {
        this.AndroidInstanceZone = AndroidInstanceZone;
    }

    /**
     * Get 实例状态：INITIALIZING，NORMAL，PROCESSING 
     * @return State 实例状态：INITIALIZING，NORMAL，PROCESSING
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set 实例状态：INITIALIZING，NORMAL，PROCESSING
     * @param State 实例状态：INITIALIZING，NORMAL，PROCESSING
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get 实例规格 
     * @return AndroidInstanceType 实例规格
     */
    public String getAndroidInstanceType() {
        return this.AndroidInstanceType;
    }

    /**
     * Set 实例规格
     * @param AndroidInstanceType 实例规格
     */
    public void setAndroidInstanceType(String AndroidInstanceType) {
        this.AndroidInstanceType = AndroidInstanceType;
    }

    /**
     * Get 实例镜像 ID 
     * @return AndroidInstanceImageId 实例镜像 ID
     */
    public String getAndroidInstanceImageId() {
        return this.AndroidInstanceImageId;
    }

    /**
     * Set 实例镜像 ID
     * @param AndroidInstanceImageId 实例镜像 ID
     */
    public void setAndroidInstanceImageId(String AndroidInstanceImageId) {
        this.AndroidInstanceImageId = AndroidInstanceImageId;
    }

    /**
     * Get 分辨率宽度 
     * @return Width 分辨率宽度
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set 分辨率宽度
     * @param Width 分辨率宽度
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get 分辨率高度 
     * @return Height 分辨率高度
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set 分辨率高度
     * @param Height 分辨率高度
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    /**
     * Get 宿主机 ID 
     * @return HostSerialNumber 宿主机 ID
     */
    public String getHostSerialNumber() {
        return this.HostSerialNumber;
    }

    /**
     * Set 宿主机 ID
     * @param HostSerialNumber 宿主机 ID
     */
    public void setHostSerialNumber(String HostSerialNumber) {
        this.HostSerialNumber = HostSerialNumber;
    }

    /**
     * Get 分组 ID 
     * @return AndroidInstanceGroupId 分组 ID
     */
    public String getAndroidInstanceGroupId() {
        return this.AndroidInstanceGroupId;
    }

    /**
     * Set 分组 ID
     * @param AndroidInstanceGroupId 分组 ID
     */
    public void setAndroidInstanceGroupId(String AndroidInstanceGroupId) {
        this.AndroidInstanceGroupId = AndroidInstanceGroupId;
    }

    /**
     * Get 标签列表 
     * @return AndroidInstanceLabels 标签列表
     */
    public AndroidInstanceLabel [] getAndroidInstanceLabels() {
        return this.AndroidInstanceLabels;
    }

    /**
     * Set 标签列表
     * @param AndroidInstanceLabels 标签列表
     */
    public void setAndroidInstanceLabels(AndroidInstanceLabel [] AndroidInstanceLabels) {
        this.AndroidInstanceLabels = AndroidInstanceLabels;
    }

    /**
     * Get 名称 
     * @return Name 名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 名称
     * @param Name 名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 用户ID 
     * @return UserId 用户ID
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set 用户ID
     * @param UserId 用户ID
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get 内网 IP 
     * @return PrivateIP 内网 IP
     */
    public String getPrivateIP() {
        return this.PrivateIP;
    }

    /**
     * Set 内网 IP
     * @param PrivateIP 内网 IP
     */
    public void setPrivateIP(String PrivateIP) {
        this.PrivateIP = PrivateIP;
    }

    /**
     * Get 创建时间 
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 机箱 ID 
     * @return HostServerSerialNumber 机箱 ID
     */
    public String getHostServerSerialNumber() {
        return this.HostServerSerialNumber;
    }

    /**
     * Set 机箱 ID
     * @param HostServerSerialNumber 机箱 ID
     */
    public void setHostServerSerialNumber(String HostServerSerialNumber) {
        this.HostServerSerialNumber = HostServerSerialNumber;
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
        this.setParamSimple(map, prefix + "HostSerialNumber", this.HostSerialNumber);
        this.setParamSimple(map, prefix + "AndroidInstanceGroupId", this.AndroidInstanceGroupId);
        this.setParamArrayObj(map, prefix + "AndroidInstanceLabels.", this.AndroidInstanceLabels);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "PrivateIP", this.PrivateIP);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "HostServerSerialNumber", this.HostServerSerialNumber);

    }
}

