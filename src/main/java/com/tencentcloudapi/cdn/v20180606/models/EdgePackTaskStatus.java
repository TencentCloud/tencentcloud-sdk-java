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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EdgePackTaskStatus extends AbstractModel{

    /**
    * APK 名称
    */
    @SerializedName("Apk")
    @Expose
    private String Apk;

    /**
    * 输出目录
    */
    @SerializedName("DstDir")
    @Expose
    private String DstDir;

    /**
    * 上传时间
    */
    @SerializedName("UploadTime")
    @Expose
    private String UploadTime;

    /**
    * 任务状态
created: 创建成功
processing: 处理中
done: 处理完成
failed: 处理失败
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 上传目录
    */
    @SerializedName("SrcDir")
    @Expose
    private String [] SrcDir;

    /**
    * 失败任务状态详情
    */
    @SerializedName("StatusDesc")
    @Expose
    private String StatusDesc;

    /**
     * Get APK 名称 
     * @return Apk APK 名称
     */
    public String getApk() {
        return this.Apk;
    }

    /**
     * Set APK 名称
     * @param Apk APK 名称
     */
    public void setApk(String Apk) {
        this.Apk = Apk;
    }

    /**
     * Get 输出目录 
     * @return DstDir 输出目录
     */
    public String getDstDir() {
        return this.DstDir;
    }

    /**
     * Set 输出目录
     * @param DstDir 输出目录
     */
    public void setDstDir(String DstDir) {
        this.DstDir = DstDir;
    }

    /**
     * Get 上传时间 
     * @return UploadTime 上传时间
     */
    public String getUploadTime() {
        return this.UploadTime;
    }

    /**
     * Set 上传时间
     * @param UploadTime 上传时间
     */
    public void setUploadTime(String UploadTime) {
        this.UploadTime = UploadTime;
    }

    /**
     * Get 任务状态
created: 创建成功
processing: 处理中
done: 处理完成
failed: 处理失败 
     * @return Status 任务状态
created: 创建成功
processing: 处理中
done: 处理完成
failed: 处理失败
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 任务状态
created: 创建成功
processing: 处理中
done: 处理完成
failed: 处理失败
     * @param Status 任务状态
created: 创建成功
processing: 处理中
done: 处理完成
failed: 处理失败
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 上传目录 
     * @return SrcDir 上传目录
     */
    public String [] getSrcDir() {
        return this.SrcDir;
    }

    /**
     * Set 上传目录
     * @param SrcDir 上传目录
     */
    public void setSrcDir(String [] SrcDir) {
        this.SrcDir = SrcDir;
    }

    /**
     * Get 失败任务状态详情 
     * @return StatusDesc 失败任务状态详情
     */
    public String getStatusDesc() {
        return this.StatusDesc;
    }

    /**
     * Set 失败任务状态详情
     * @param StatusDesc 失败任务状态详情
     */
    public void setStatusDesc(String StatusDesc) {
        this.StatusDesc = StatusDesc;
    }

    public EdgePackTaskStatus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EdgePackTaskStatus(EdgePackTaskStatus source) {
        if (source.Apk != null) {
            this.Apk = new String(source.Apk);
        }
        if (source.DstDir != null) {
            this.DstDir = new String(source.DstDir);
        }
        if (source.UploadTime != null) {
            this.UploadTime = new String(source.UploadTime);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.SrcDir != null) {
            this.SrcDir = new String[source.SrcDir.length];
            for (int i = 0; i < source.SrcDir.length; i++) {
                this.SrcDir[i] = new String(source.SrcDir[i]);
            }
        }
        if (source.StatusDesc != null) {
            this.StatusDesc = new String(source.StatusDesc);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Apk", this.Apk);
        this.setParamSimple(map, prefix + "DstDir", this.DstDir);
        this.setParamSimple(map, prefix + "UploadTime", this.UploadTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArraySimple(map, prefix + "SrcDir.", this.SrcDir);
        this.setParamSimple(map, prefix + "StatusDesc", this.StatusDesc);

    }
}

