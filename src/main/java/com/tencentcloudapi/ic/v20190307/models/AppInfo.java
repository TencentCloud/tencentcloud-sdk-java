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
package com.tencentcloudapi.ic.v20190307.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AppInfo  extends AbstractModel{

    /**
    * 应用id
    */
    @SerializedName("Sdkappid")
    @Expose
    private String Sdkappid;

    /**
    * 应用key
    */
    @SerializedName("Appkey")
    @Expose
    private String Appkey;

    /**
    * 用户appid
    */
    @SerializedName("CloudAppid")
    @Expose
    private String CloudAppid;

    /**
    * 应用名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 应用描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 创建时间
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * 应用类型
    */
    @SerializedName("BizType")
    @Expose
    private Integer BizType;

    /**
    * 用户Uin
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
     * 获取应用id
     * @return Sdkappid 应用id
     */
    public String getSdkappid() {
        return this.Sdkappid;
    }

    /**
     * 设置应用id
     * @param Sdkappid 应用id
     */
    public void setSdkappid(String Sdkappid) {
        this.Sdkappid = Sdkappid;
    }

    /**
     * 获取应用key
     * @return Appkey 应用key
     */
    public String getAppkey() {
        return this.Appkey;
    }

    /**
     * 设置应用key
     * @param Appkey 应用key
     */
    public void setAppkey(String Appkey) {
        this.Appkey = Appkey;
    }

    /**
     * 获取用户appid
     * @return CloudAppid 用户appid
     */
    public String getCloudAppid() {
        return this.CloudAppid;
    }

    /**
     * 设置用户appid
     * @param CloudAppid 用户appid
     */
    public void setCloudAppid(String CloudAppid) {
        this.CloudAppid = CloudAppid;
    }

    /**
     * 获取应用名称
注意：此字段可能返回 null，表示取不到有效值。
     * @return Name 应用名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * 设置应用名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 应用名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * 获取应用描述
     * @return Description 应用描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * 设置应用描述
     * @param Description 应用描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * 获取创建时间
     * @return CreatedTime 创建时间
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * 设置创建时间
     * @param CreatedTime 创建时间
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * 获取应用类型
     * @return BizType 应用类型
     */
    public Integer getBizType() {
        return this.BizType;
    }

    /**
     * 设置应用类型
     * @param BizType 应用类型
     */
    public void setBizType(Integer BizType) {
        this.BizType = BizType;
    }

    /**
     * 获取用户Uin
     * @return Uin 用户Uin
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * 设置用户Uin
     * @param Uin 用户Uin
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Sdkappid", this.Sdkappid);
        this.setParamSimple(map, prefix + "Appkey", this.Appkey);
        this.setParamSimple(map, prefix + "CloudAppid", this.CloudAppid);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "BizType", this.BizType);
        this.setParamSimple(map, prefix + "Uin", this.Uin);

    }
}

