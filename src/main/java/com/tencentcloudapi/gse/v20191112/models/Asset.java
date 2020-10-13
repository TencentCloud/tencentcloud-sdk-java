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
package com.tencentcloudapi.gse.v20191112.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Asset extends AbstractModel{

    /**
    * 生成包ID
    */
    @SerializedName("AssetId")
    @Expose
    private String AssetId;

    /**
    * 生成包名字，最小长度为1，最大长度为64
    */
    @SerializedName("AssetName")
    @Expose
    private String AssetName;

    /**
    * 生成包版本，最小长度为1，最大长度为64
    */
    @SerializedName("AssetVersion")
    @Expose
    private String AssetVersion;

    /**
    * 生成包可运行的操作系统，暂时只支持CentOS7.16
    */
    @SerializedName("OperateSystem")
    @Expose
    private String OperateSystem;

    /**
    * 生成包状态，0代表上传中，1代表上传失败，2代表上传成功
    */
    @SerializedName("Stauts")
    @Expose
    private Long Stauts;

    /**
    * 生成包大小
    */
    @SerializedName("Size")
    @Expose
    private String Size;

    /**
    * 生成包创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 生成包绑定的Fleet个数，最小值为0
    */
    @SerializedName("BindFleetNum")
    @Expose
    private Long BindFleetNum;

    /**
    * 生成包的全局唯一资源标识符
    */
    @SerializedName("AssetArn")
    @Expose
    private String AssetArn;

    /**
    * 生成包支持的操作系统镜像id
    */
    @SerializedName("ImageId")
    @Expose
    private String ImageId;

    /**
    * 生成包支持的操作系统类型
    */
    @SerializedName("OsType")
    @Expose
    private String OsType;

    /**
     * Get 生成包ID 
     * @return AssetId 生成包ID
     */
    public String getAssetId() {
        return this.AssetId;
    }

    /**
     * Set 生成包ID
     * @param AssetId 生成包ID
     */
    public void setAssetId(String AssetId) {
        this.AssetId = AssetId;
    }

    /**
     * Get 生成包名字，最小长度为1，最大长度为64 
     * @return AssetName 生成包名字，最小长度为1，最大长度为64
     */
    public String getAssetName() {
        return this.AssetName;
    }

    /**
     * Set 生成包名字，最小长度为1，最大长度为64
     * @param AssetName 生成包名字，最小长度为1，最大长度为64
     */
    public void setAssetName(String AssetName) {
        this.AssetName = AssetName;
    }

    /**
     * Get 生成包版本，最小长度为1，最大长度为64 
     * @return AssetVersion 生成包版本，最小长度为1，最大长度为64
     */
    public String getAssetVersion() {
        return this.AssetVersion;
    }

    /**
     * Set 生成包版本，最小长度为1，最大长度为64
     * @param AssetVersion 生成包版本，最小长度为1，最大长度为64
     */
    public void setAssetVersion(String AssetVersion) {
        this.AssetVersion = AssetVersion;
    }

    /**
     * Get 生成包可运行的操作系统，暂时只支持CentOS7.16 
     * @return OperateSystem 生成包可运行的操作系统，暂时只支持CentOS7.16
     */
    public String getOperateSystem() {
        return this.OperateSystem;
    }

    /**
     * Set 生成包可运行的操作系统，暂时只支持CentOS7.16
     * @param OperateSystem 生成包可运行的操作系统，暂时只支持CentOS7.16
     */
    public void setOperateSystem(String OperateSystem) {
        this.OperateSystem = OperateSystem;
    }

    /**
     * Get 生成包状态，0代表上传中，1代表上传失败，2代表上传成功 
     * @return Stauts 生成包状态，0代表上传中，1代表上传失败，2代表上传成功
     */
    public Long getStauts() {
        return this.Stauts;
    }

    /**
     * Set 生成包状态，0代表上传中，1代表上传失败，2代表上传成功
     * @param Stauts 生成包状态，0代表上传中，1代表上传失败，2代表上传成功
     */
    public void setStauts(Long Stauts) {
        this.Stauts = Stauts;
    }

    /**
     * Get 生成包大小 
     * @return Size 生成包大小
     */
    public String getSize() {
        return this.Size;
    }

    /**
     * Set 生成包大小
     * @param Size 生成包大小
     */
    public void setSize(String Size) {
        this.Size = Size;
    }

    /**
     * Get 生成包创建时间 
     * @return CreateTime 生成包创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 生成包创建时间
     * @param CreateTime 生成包创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 生成包绑定的Fleet个数，最小值为0 
     * @return BindFleetNum 生成包绑定的Fleet个数，最小值为0
     */
    public Long getBindFleetNum() {
        return this.BindFleetNum;
    }

    /**
     * Set 生成包绑定的Fleet个数，最小值为0
     * @param BindFleetNum 生成包绑定的Fleet个数，最小值为0
     */
    public void setBindFleetNum(Long BindFleetNum) {
        this.BindFleetNum = BindFleetNum;
    }

    /**
     * Get 生成包的全局唯一资源标识符 
     * @return AssetArn 生成包的全局唯一资源标识符
     */
    public String getAssetArn() {
        return this.AssetArn;
    }

    /**
     * Set 生成包的全局唯一资源标识符
     * @param AssetArn 生成包的全局唯一资源标识符
     */
    public void setAssetArn(String AssetArn) {
        this.AssetArn = AssetArn;
    }

    /**
     * Get 生成包支持的操作系统镜像id 
     * @return ImageId 生成包支持的操作系统镜像id
     */
    public String getImageId() {
        return this.ImageId;
    }

    /**
     * Set 生成包支持的操作系统镜像id
     * @param ImageId 生成包支持的操作系统镜像id
     */
    public void setImageId(String ImageId) {
        this.ImageId = ImageId;
    }

    /**
     * Get 生成包支持的操作系统类型 
     * @return OsType 生成包支持的操作系统类型
     */
    public String getOsType() {
        return this.OsType;
    }

    /**
     * Set 生成包支持的操作系统类型
     * @param OsType 生成包支持的操作系统类型
     */
    public void setOsType(String OsType) {
        this.OsType = OsType;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AssetId", this.AssetId);
        this.setParamSimple(map, prefix + "AssetName", this.AssetName);
        this.setParamSimple(map, prefix + "AssetVersion", this.AssetVersion);
        this.setParamSimple(map, prefix + "OperateSystem", this.OperateSystem);
        this.setParamSimple(map, prefix + "Stauts", this.Stauts);
        this.setParamSimple(map, prefix + "Size", this.Size);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "BindFleetNum", this.BindFleetNum);
        this.setParamSimple(map, prefix + "AssetArn", this.AssetArn);
        this.setParamSimple(map, prefix + "ImageId", this.ImageId);
        this.setParamSimple(map, prefix + "OsType", this.OsType);

    }
}

