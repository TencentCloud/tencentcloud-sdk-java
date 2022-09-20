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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SpeedTestingStatistics extends AbstractModel{

    /**
    * 首屏时间，单位 ms。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FirstContentfulPaint")
    @Expose
    private Long FirstContentfulPaint;

    /**
    * 首屏完全渲染时间，单位 ms。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FirstMeaningfulPaint")
    @Expose
    private Long FirstMeaningfulPaint;

    /**
    * 整体下载速度，单位 KB/s。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OverallDownloadSpeed")
    @Expose
    private Float OverallDownloadSpeed;

    /**
    * 渲染时间，单位 ms。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RenderTime")
    @Expose
    private Long RenderTime;

    /**
    * 文档完成时间, 单位 ms。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DocumentFinishTime")
    @Expose
    private Long DocumentFinishTime;

    /**
    * 基础文档TCP连接时间，单位 ms。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TcpConnectionTime")
    @Expose
    private Long TcpConnectionTime;

    /**
    * 基础文档服务器响应时间，单位 ms。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResponseTime")
    @Expose
    private Long ResponseTime;

    /**
    * 基础文档下载时间，单位 ms。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FileDownloadTime")
    @Expose
    private Long FileDownloadTime;

    /**
    * 整体性能，测试总时间，单位 ms。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LoadTime")
    @Expose
    private Long LoadTime;

    /**
     * Get 首屏时间，单位 ms。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FirstContentfulPaint 首屏时间，单位 ms。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getFirstContentfulPaint() {
        return this.FirstContentfulPaint;
    }

    /**
     * Set 首屏时间，单位 ms。
注意：此字段可能返回 null，表示取不到有效值。
     * @param FirstContentfulPaint 首屏时间，单位 ms。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFirstContentfulPaint(Long FirstContentfulPaint) {
        this.FirstContentfulPaint = FirstContentfulPaint;
    }

    /**
     * Get 首屏完全渲染时间，单位 ms。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FirstMeaningfulPaint 首屏完全渲染时间，单位 ms。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getFirstMeaningfulPaint() {
        return this.FirstMeaningfulPaint;
    }

    /**
     * Set 首屏完全渲染时间，单位 ms。
注意：此字段可能返回 null，表示取不到有效值。
     * @param FirstMeaningfulPaint 首屏完全渲染时间，单位 ms。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFirstMeaningfulPaint(Long FirstMeaningfulPaint) {
        this.FirstMeaningfulPaint = FirstMeaningfulPaint;
    }

    /**
     * Get 整体下载速度，单位 KB/s。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OverallDownloadSpeed 整体下载速度，单位 KB/s。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getOverallDownloadSpeed() {
        return this.OverallDownloadSpeed;
    }

    /**
     * Set 整体下载速度，单位 KB/s。
注意：此字段可能返回 null，表示取不到有效值。
     * @param OverallDownloadSpeed 整体下载速度，单位 KB/s。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOverallDownloadSpeed(Float OverallDownloadSpeed) {
        this.OverallDownloadSpeed = OverallDownloadSpeed;
    }

    /**
     * Get 渲染时间，单位 ms。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RenderTime 渲染时间，单位 ms。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRenderTime() {
        return this.RenderTime;
    }

    /**
     * Set 渲染时间，单位 ms。
注意：此字段可能返回 null，表示取不到有效值。
     * @param RenderTime 渲染时间，单位 ms。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRenderTime(Long RenderTime) {
        this.RenderTime = RenderTime;
    }

    /**
     * Get 文档完成时间, 单位 ms。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DocumentFinishTime 文档完成时间, 单位 ms。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDocumentFinishTime() {
        return this.DocumentFinishTime;
    }

    /**
     * Set 文档完成时间, 单位 ms。
注意：此字段可能返回 null，表示取不到有效值。
     * @param DocumentFinishTime 文档完成时间, 单位 ms。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDocumentFinishTime(Long DocumentFinishTime) {
        this.DocumentFinishTime = DocumentFinishTime;
    }

    /**
     * Get 基础文档TCP连接时间，单位 ms。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TcpConnectionTime 基础文档TCP连接时间，单位 ms。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTcpConnectionTime() {
        return this.TcpConnectionTime;
    }

    /**
     * Set 基础文档TCP连接时间，单位 ms。
注意：此字段可能返回 null，表示取不到有效值。
     * @param TcpConnectionTime 基础文档TCP连接时间，单位 ms。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTcpConnectionTime(Long TcpConnectionTime) {
        this.TcpConnectionTime = TcpConnectionTime;
    }

    /**
     * Get 基础文档服务器响应时间，单位 ms。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResponseTime 基础文档服务器响应时间，单位 ms。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getResponseTime() {
        return this.ResponseTime;
    }

    /**
     * Set 基础文档服务器响应时间，单位 ms。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResponseTime 基础文档服务器响应时间，单位 ms。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResponseTime(Long ResponseTime) {
        this.ResponseTime = ResponseTime;
    }

    /**
     * Get 基础文档下载时间，单位 ms。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FileDownloadTime 基础文档下载时间，单位 ms。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getFileDownloadTime() {
        return this.FileDownloadTime;
    }

    /**
     * Set 基础文档下载时间，单位 ms。
注意：此字段可能返回 null，表示取不到有效值。
     * @param FileDownloadTime 基础文档下载时间，单位 ms。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFileDownloadTime(Long FileDownloadTime) {
        this.FileDownloadTime = FileDownloadTime;
    }

    /**
     * Get 整体性能，测试总时间，单位 ms。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LoadTime 整体性能，测试总时间，单位 ms。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getLoadTime() {
        return this.LoadTime;
    }

    /**
     * Set 整体性能，测试总时间，单位 ms。
注意：此字段可能返回 null，表示取不到有效值。
     * @param LoadTime 整体性能，测试总时间，单位 ms。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLoadTime(Long LoadTime) {
        this.LoadTime = LoadTime;
    }

    public SpeedTestingStatistics() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SpeedTestingStatistics(SpeedTestingStatistics source) {
        if (source.FirstContentfulPaint != null) {
            this.FirstContentfulPaint = new Long(source.FirstContentfulPaint);
        }
        if (source.FirstMeaningfulPaint != null) {
            this.FirstMeaningfulPaint = new Long(source.FirstMeaningfulPaint);
        }
        if (source.OverallDownloadSpeed != null) {
            this.OverallDownloadSpeed = new Float(source.OverallDownloadSpeed);
        }
        if (source.RenderTime != null) {
            this.RenderTime = new Long(source.RenderTime);
        }
        if (source.DocumentFinishTime != null) {
            this.DocumentFinishTime = new Long(source.DocumentFinishTime);
        }
        if (source.TcpConnectionTime != null) {
            this.TcpConnectionTime = new Long(source.TcpConnectionTime);
        }
        if (source.ResponseTime != null) {
            this.ResponseTime = new Long(source.ResponseTime);
        }
        if (source.FileDownloadTime != null) {
            this.FileDownloadTime = new Long(source.FileDownloadTime);
        }
        if (source.LoadTime != null) {
            this.LoadTime = new Long(source.LoadTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FirstContentfulPaint", this.FirstContentfulPaint);
        this.setParamSimple(map, prefix + "FirstMeaningfulPaint", this.FirstMeaningfulPaint);
        this.setParamSimple(map, prefix + "OverallDownloadSpeed", this.OverallDownloadSpeed);
        this.setParamSimple(map, prefix + "RenderTime", this.RenderTime);
        this.setParamSimple(map, prefix + "DocumentFinishTime", this.DocumentFinishTime);
        this.setParamSimple(map, prefix + "TcpConnectionTime", this.TcpConnectionTime);
        this.setParamSimple(map, prefix + "ResponseTime", this.ResponseTime);
        this.setParamSimple(map, prefix + "FileDownloadTime", this.FileDownloadTime);
        this.setParamSimple(map, prefix + "LoadTime", this.LoadTime);

    }
}

