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

public class ImageLayer extends AbstractModel {

    /**
    * <p>镜像层序号</p>
    */
    @SerializedName("LayerIndex")
    @Expose
    private Long LayerIndex;

    /**
    * <p>镜像层id</p>
    */
    @SerializedName("LayerId")
    @Expose
    private String LayerId;

    /**
    * <p>镜像层命令行</p>
    */
    @SerializedName("LayerCmd")
    @Expose
    private String LayerCmd;

    /**
    * <p>镜像层大小</p>
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

    /**
    * <p>严重漏洞数</p>
    */
    @SerializedName("CriticalLevelVulCnt")
    @Expose
    private Long CriticalLevelVulCnt;

    /**
    * <p>高危漏洞数</p>
    */
    @SerializedName("HighLevelVulCnt")
    @Expose
    private Long HighLevelVulCnt;

    /**
    * <p>中危漏洞数</p>
    */
    @SerializedName("MediumLevelVulCnt")
    @Expose
    private Long MediumLevelVulCnt;

    /**
    * <p>低危漏洞数</p>
    */
    @SerializedName("LowLevelVulCnt")
    @Expose
    private Long LowLevelVulCnt;

    /**
    * <p>木马数</p>
    */
    @SerializedName("VirusCnt")
    @Expose
    private Long VirusCnt;

    /**
    * <p>敏感信息数</p>
    */
    @SerializedName("SensitiveCnt")
    @Expose
    private Long SensitiveCnt;

    /**
    * <p>镜像层创建时间</p><p>参数格式：YYYY-MM-DD hh:mm:ss</p>
    */
    @SerializedName("LayerCreateTime")
    @Expose
    private String LayerCreateTime;

    /**
     * Get <p>镜像层序号</p> 
     * @return LayerIndex <p>镜像层序号</p>
     */
    public Long getLayerIndex() {
        return this.LayerIndex;
    }

    /**
     * Set <p>镜像层序号</p>
     * @param LayerIndex <p>镜像层序号</p>
     */
    public void setLayerIndex(Long LayerIndex) {
        this.LayerIndex = LayerIndex;
    }

    /**
     * Get <p>镜像层id</p> 
     * @return LayerId <p>镜像层id</p>
     */
    public String getLayerId() {
        return this.LayerId;
    }

    /**
     * Set <p>镜像层id</p>
     * @param LayerId <p>镜像层id</p>
     */
    public void setLayerId(String LayerId) {
        this.LayerId = LayerId;
    }

    /**
     * Get <p>镜像层命令行</p> 
     * @return LayerCmd <p>镜像层命令行</p>
     */
    public String getLayerCmd() {
        return this.LayerCmd;
    }

    /**
     * Set <p>镜像层命令行</p>
     * @param LayerCmd <p>镜像层命令行</p>
     */
    public void setLayerCmd(String LayerCmd) {
        this.LayerCmd = LayerCmd;
    }

    /**
     * Get <p>镜像层大小</p> 
     * @return Size <p>镜像层大小</p>
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set <p>镜像层大小</p>
     * @param Size <p>镜像层大小</p>
     */
    public void setSize(Long Size) {
        this.Size = Size;
    }

    /**
     * Get <p>严重漏洞数</p> 
     * @return CriticalLevelVulCnt <p>严重漏洞数</p>
     */
    public Long getCriticalLevelVulCnt() {
        return this.CriticalLevelVulCnt;
    }

    /**
     * Set <p>严重漏洞数</p>
     * @param CriticalLevelVulCnt <p>严重漏洞数</p>
     */
    public void setCriticalLevelVulCnt(Long CriticalLevelVulCnt) {
        this.CriticalLevelVulCnt = CriticalLevelVulCnt;
    }

    /**
     * Get <p>高危漏洞数</p> 
     * @return HighLevelVulCnt <p>高危漏洞数</p>
     */
    public Long getHighLevelVulCnt() {
        return this.HighLevelVulCnt;
    }

    /**
     * Set <p>高危漏洞数</p>
     * @param HighLevelVulCnt <p>高危漏洞数</p>
     */
    public void setHighLevelVulCnt(Long HighLevelVulCnt) {
        this.HighLevelVulCnt = HighLevelVulCnt;
    }

    /**
     * Get <p>中危漏洞数</p> 
     * @return MediumLevelVulCnt <p>中危漏洞数</p>
     */
    public Long getMediumLevelVulCnt() {
        return this.MediumLevelVulCnt;
    }

    /**
     * Set <p>中危漏洞数</p>
     * @param MediumLevelVulCnt <p>中危漏洞数</p>
     */
    public void setMediumLevelVulCnt(Long MediumLevelVulCnt) {
        this.MediumLevelVulCnt = MediumLevelVulCnt;
    }

    /**
     * Get <p>低危漏洞数</p> 
     * @return LowLevelVulCnt <p>低危漏洞数</p>
     */
    public Long getLowLevelVulCnt() {
        return this.LowLevelVulCnt;
    }

    /**
     * Set <p>低危漏洞数</p>
     * @param LowLevelVulCnt <p>低危漏洞数</p>
     */
    public void setLowLevelVulCnt(Long LowLevelVulCnt) {
        this.LowLevelVulCnt = LowLevelVulCnt;
    }

    /**
     * Get <p>木马数</p> 
     * @return VirusCnt <p>木马数</p>
     */
    public Long getVirusCnt() {
        return this.VirusCnt;
    }

    /**
     * Set <p>木马数</p>
     * @param VirusCnt <p>木马数</p>
     */
    public void setVirusCnt(Long VirusCnt) {
        this.VirusCnt = VirusCnt;
    }

    /**
     * Get <p>敏感信息数</p> 
     * @return SensitiveCnt <p>敏感信息数</p>
     */
    public Long getSensitiveCnt() {
        return this.SensitiveCnt;
    }

    /**
     * Set <p>敏感信息数</p>
     * @param SensitiveCnt <p>敏感信息数</p>
     */
    public void setSensitiveCnt(Long SensitiveCnt) {
        this.SensitiveCnt = SensitiveCnt;
    }

    /**
     * Get <p>镜像层创建时间</p><p>参数格式：YYYY-MM-DD hh:mm:ss</p> 
     * @return LayerCreateTime <p>镜像层创建时间</p><p>参数格式：YYYY-MM-DD hh:mm:ss</p>
     */
    public String getLayerCreateTime() {
        return this.LayerCreateTime;
    }

    /**
     * Set <p>镜像层创建时间</p><p>参数格式：YYYY-MM-DD hh:mm:ss</p>
     * @param LayerCreateTime <p>镜像层创建时间</p><p>参数格式：YYYY-MM-DD hh:mm:ss</p>
     */
    public void setLayerCreateTime(String LayerCreateTime) {
        this.LayerCreateTime = LayerCreateTime;
    }

    public ImageLayer() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageLayer(ImageLayer source) {
        if (source.LayerIndex != null) {
            this.LayerIndex = new Long(source.LayerIndex);
        }
        if (source.LayerId != null) {
            this.LayerId = new String(source.LayerId);
        }
        if (source.LayerCmd != null) {
            this.LayerCmd = new String(source.LayerCmd);
        }
        if (source.Size != null) {
            this.Size = new Long(source.Size);
        }
        if (source.CriticalLevelVulCnt != null) {
            this.CriticalLevelVulCnt = new Long(source.CriticalLevelVulCnt);
        }
        if (source.HighLevelVulCnt != null) {
            this.HighLevelVulCnt = new Long(source.HighLevelVulCnt);
        }
        if (source.MediumLevelVulCnt != null) {
            this.MediumLevelVulCnt = new Long(source.MediumLevelVulCnt);
        }
        if (source.LowLevelVulCnt != null) {
            this.LowLevelVulCnt = new Long(source.LowLevelVulCnt);
        }
        if (source.VirusCnt != null) {
            this.VirusCnt = new Long(source.VirusCnt);
        }
        if (source.SensitiveCnt != null) {
            this.SensitiveCnt = new Long(source.SensitiveCnt);
        }
        if (source.LayerCreateTime != null) {
            this.LayerCreateTime = new String(source.LayerCreateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LayerIndex", this.LayerIndex);
        this.setParamSimple(map, prefix + "LayerId", this.LayerId);
        this.setParamSimple(map, prefix + "LayerCmd", this.LayerCmd);
        this.setParamSimple(map, prefix + "Size", this.Size);
        this.setParamSimple(map, prefix + "CriticalLevelVulCnt", this.CriticalLevelVulCnt);
        this.setParamSimple(map, prefix + "HighLevelVulCnt", this.HighLevelVulCnt);
        this.setParamSimple(map, prefix + "MediumLevelVulCnt", this.MediumLevelVulCnt);
        this.setParamSimple(map, prefix + "LowLevelVulCnt", this.LowLevelVulCnt);
        this.setParamSimple(map, prefix + "VirusCnt", this.VirusCnt);
        this.setParamSimple(map, prefix + "SensitiveCnt", this.SensitiveCnt);
        this.setParamSimple(map, prefix + "LayerCreateTime", this.LayerCreateTime);

    }
}

