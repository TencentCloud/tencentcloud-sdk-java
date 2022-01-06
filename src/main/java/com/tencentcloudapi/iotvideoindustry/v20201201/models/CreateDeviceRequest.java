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
package com.tencentcloudapi.iotvideoindustry.v20201201.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateDeviceRequest extends AbstractModel{

    /**
    * 设备名称
    */
    @SerializedName("NickName")
    @Expose
    private String NickName;

    /**
    * 设备密码
    */
    @SerializedName("PassWord")
    @Expose
    private String PassWord;

    /**
    * 设备类型，1：国标VMS设备(公有云不支持此类型)，2：国标IPC设备，3：国标NVR设备，9：智能告警设备(公有云不支持此类型)
    */
    @SerializedName("DeviceType")
    @Expose
    private Long DeviceType;

    /**
    * 设备需要绑定的分组ID，参数为空则默认绑定到根分组
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
     * Get 设备名称 
     * @return NickName 设备名称
     */
    public String getNickName() {
        return this.NickName;
    }

    /**
     * Set 设备名称
     * @param NickName 设备名称
     */
    public void setNickName(String NickName) {
        this.NickName = NickName;
    }

    /**
     * Get 设备密码 
     * @return PassWord 设备密码
     */
    public String getPassWord() {
        return this.PassWord;
    }

    /**
     * Set 设备密码
     * @param PassWord 设备密码
     */
    public void setPassWord(String PassWord) {
        this.PassWord = PassWord;
    }

    /**
     * Get 设备类型，1：国标VMS设备(公有云不支持此类型)，2：国标IPC设备，3：国标NVR设备，9：智能告警设备(公有云不支持此类型) 
     * @return DeviceType 设备类型，1：国标VMS设备(公有云不支持此类型)，2：国标IPC设备，3：国标NVR设备，9：智能告警设备(公有云不支持此类型)
     */
    public Long getDeviceType() {
        return this.DeviceType;
    }

    /**
     * Set 设备类型，1：国标VMS设备(公有云不支持此类型)，2：国标IPC设备，3：国标NVR设备，9：智能告警设备(公有云不支持此类型)
     * @param DeviceType 设备类型，1：国标VMS设备(公有云不支持此类型)，2：国标IPC设备，3：国标NVR设备，9：智能告警设备(公有云不支持此类型)
     */
    public void setDeviceType(Long DeviceType) {
        this.DeviceType = DeviceType;
    }

    /**
     * Get 设备需要绑定的分组ID，参数为空则默认绑定到根分组 
     * @return GroupId 设备需要绑定的分组ID，参数为空则默认绑定到根分组
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 设备需要绑定的分组ID，参数为空则默认绑定到根分组
     * @param GroupId 设备需要绑定的分组ID，参数为空则默认绑定到根分组
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    public CreateDeviceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateDeviceRequest(CreateDeviceRequest source) {
        if (source.NickName != null) {
            this.NickName = new String(source.NickName);
        }
        if (source.PassWord != null) {
            this.PassWord = new String(source.PassWord);
        }
        if (source.DeviceType != null) {
            this.DeviceType = new Long(source.DeviceType);
        }
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NickName", this.NickName);
        this.setParamSimple(map, prefix + "PassWord", this.PassWord);
        this.setParamSimple(map, prefix + "DeviceType", this.DeviceType);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);

    }
}

