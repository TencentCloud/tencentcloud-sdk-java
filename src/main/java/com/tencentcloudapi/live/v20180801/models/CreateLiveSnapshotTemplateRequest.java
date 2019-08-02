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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateLiveSnapshotTemplateRequest  extends AbstractModel{

    /**
    * 模板名称，非空的字符串。
长度上限：255字节。
    */
    @SerializedName("TemplateName")
    @Expose
    private String TemplateName;

    /**
    * Cos AppId。
    */
    @SerializedName("CosAppId")
    @Expose
    private Integer CosAppId;

    /**
    * Cos Bucket名称。
    */
    @SerializedName("CosBucket")
    @Expose
    private String CosBucket;

    /**
    * Cos地区。
    */
    @SerializedName("CosRegion")
    @Expose
    private String CosRegion;

    /**
    * 描述信息。
长度上限：1024字节。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 截图间隔，单位s，默认10s。
范围： 5s ~ 600s。
    */
    @SerializedName("SnapshotInterval")
    @Expose
    private Integer SnapshotInterval;

    /**
    * 截图宽度。默认：0（原始宽）。
    */
    @SerializedName("Width")
    @Expose
    private Integer Width;

    /**
    * 截图高度。默认：0（原始高）。
    */
    @SerializedName("Height")
    @Expose
    private Integer Height;

    /**
    * 是否开启鉴黄，0：不开启，1：开启。默认：0。
    */
    @SerializedName("PornFlag")
    @Expose
    private Integer PornFlag;

    /**
     * 获取模板名称，非空的字符串。
长度上限：255字节。
     * @return TemplateName 模板名称，非空的字符串。
长度上限：255字节。
     */
    public String getTemplateName() {
        return this.TemplateName;
    }

    /**
     * 设置模板名称，非空的字符串。
长度上限：255字节。
     * @param TemplateName 模板名称，非空的字符串。
长度上限：255字节。
     */
    public void setTemplateName(String TemplateName) {
        this.TemplateName = TemplateName;
    }

    /**
     * 获取Cos AppId。
     * @return CosAppId Cos AppId。
     */
    public Integer getCosAppId() {
        return this.CosAppId;
    }

    /**
     * 设置Cos AppId。
     * @param CosAppId Cos AppId。
     */
    public void setCosAppId(Integer CosAppId) {
        this.CosAppId = CosAppId;
    }

    /**
     * 获取Cos Bucket名称。
     * @return CosBucket Cos Bucket名称。
     */
    public String getCosBucket() {
        return this.CosBucket;
    }

    /**
     * 设置Cos Bucket名称。
     * @param CosBucket Cos Bucket名称。
     */
    public void setCosBucket(String CosBucket) {
        this.CosBucket = CosBucket;
    }

    /**
     * 获取Cos地区。
     * @return CosRegion Cos地区。
     */
    public String getCosRegion() {
        return this.CosRegion;
    }

    /**
     * 设置Cos地区。
     * @param CosRegion Cos地区。
     */
    public void setCosRegion(String CosRegion) {
        this.CosRegion = CosRegion;
    }

    /**
     * 获取描述信息。
长度上限：1024字节。
     * @return Description 描述信息。
长度上限：1024字节。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * 设置描述信息。
长度上限：1024字节。
     * @param Description 描述信息。
长度上限：1024字节。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * 获取截图间隔，单位s，默认10s。
范围： 5s ~ 600s。
     * @return SnapshotInterval 截图间隔，单位s，默认10s。
范围： 5s ~ 600s。
     */
    public Integer getSnapshotInterval() {
        return this.SnapshotInterval;
    }

    /**
     * 设置截图间隔，单位s，默认10s。
范围： 5s ~ 600s。
     * @param SnapshotInterval 截图间隔，单位s，默认10s。
范围： 5s ~ 600s。
     */
    public void setSnapshotInterval(Integer SnapshotInterval) {
        this.SnapshotInterval = SnapshotInterval;
    }

    /**
     * 获取截图宽度。默认：0（原始宽）。
     * @return Width 截图宽度。默认：0（原始宽）。
     */
    public Integer getWidth() {
        return this.Width;
    }

    /**
     * 设置截图宽度。默认：0（原始宽）。
     * @param Width 截图宽度。默认：0（原始宽）。
     */
    public void setWidth(Integer Width) {
        this.Width = Width;
    }

    /**
     * 获取截图高度。默认：0（原始高）。
     * @return Height 截图高度。默认：0（原始高）。
     */
    public Integer getHeight() {
        return this.Height;
    }

    /**
     * 设置截图高度。默认：0（原始高）。
     * @param Height 截图高度。默认：0（原始高）。
     */
    public void setHeight(Integer Height) {
        this.Height = Height;
    }

    /**
     * 获取是否开启鉴黄，0：不开启，1：开启。默认：0。
     * @return PornFlag 是否开启鉴黄，0：不开启，1：开启。默认：0。
     */
    public Integer getPornFlag() {
        return this.PornFlag;
    }

    /**
     * 设置是否开启鉴黄，0：不开启，1：开启。默认：0。
     * @param PornFlag 是否开启鉴黄，0：不开启，1：开启。默认：0。
     */
    public void setPornFlag(Integer PornFlag) {
        this.PornFlag = PornFlag;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TemplateName", this.TemplateName);
        this.setParamSimple(map, prefix + "CosAppId", this.CosAppId);
        this.setParamSimple(map, prefix + "CosBucket", this.CosBucket);
        this.setParamSimple(map, prefix + "CosRegion", this.CosRegion);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "SnapshotInterval", this.SnapshotInterval);
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "Height", this.Height);
        this.setParamSimple(map, prefix + "PornFlag", this.PornFlag);

    }
}

