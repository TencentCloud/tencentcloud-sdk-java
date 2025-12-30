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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AigcUsageDataItem extends AbstractModel {

    /**
    * AIGC规格。
取值有：
<li>Qwen2.0</li>
<li>Gem2.5</li>
<li>Gem3.0_1K</li>
<li>Gem3.0_2K</li>
<li>Gem3.0_4K</li>
<li>Sora2</li>
<li>Veo3.1Fast</li>
<li>Veo3.1Standard</li>
<li>Kling2.5pro_720P</li>
<li>Kling2.5pro_1080P</li>
<li>KlingO1_1080P</li>
<li>Kling2.0&2.1std_720P</li>
<li>Kling2.0&2.1pro_1080P</li>
<li>KlingO1_720P</li>
<li>Hailuo02&2.3_1080P</li>
<li>Hailuo02&2.3_768P</li>
<li>Hailuo2.3fast_768P</li>
<li>Hailuo2.3fast_1080P</li>
<li>Jimeng4.0</li>
<li>Jimeng3.0pro</li>
<li>ViduQ2_720P</li>
<li>ViduQ2_1080P</li>
<li>ViduQ2pro_720P</li>
<li>ViduQ2pro_1080P</li>
<li>ViduQ2turbo_720P</li>
<li>ViduQ2turbo_1080P</li>
<li>ViduQ2_720P_OffPeak</li>
<li>ViduQ2_1080P_OffPeak</li>
<li>ViduQ2turbo_720P_OffPeak</li>
<li>ViduQ2turbo_1080P_OffPeak</li>
<li>ViduQ2pro_720P_OffPeak</li>
<li>ViduQ2pro_1080P_OffPeak</li>
<li>Hunyuan1.5_720P</li>
<li>Hunyuan1.5_1080P</li>
<li>Hunyuan3.0_1K</li>
<li>Hunyuan3.0_2K</li>
<li>Hunyuan3.0_4K</li>
<li>Mingmou1.0_1080P</li>
<li>Mingmou1.0_1K</li>
<li>Mingmou1.0_2K</li>
<li>Mingmou1.0_4K</li>
<li>Mingmou1.0_720P</li>
<li>Seedance1.5ProAudioOn_480P</li>
<li>Seedance1.5ProAudioOff_480P</li>
<li>Seedance1.5ProAudioOn_720P</li>
<li>Seedance1.5ProAudioOff_720P</li>
<li>Seedance1.0Pro_480P</li>
<li>Seedance1.0Pro_720P</li>
<li>Seedance1.0Pro_1080P</li>
<li>Seedance1.0ProFast480P</li>
<li>Seedance1.0ProFast720P</li>
<li>Seedance1.0ProFast1080P</li>
<li>Seedance1.0Lite480P</li>
<li>Seedance1.0Lite720P</li>
<li>Seedance1.0Lite1080P</li>
<li> unknown</li>
    */
    @SerializedName("Specification")
    @Expose
    private String Specification;

    /**
    * 用量数据。
    */
    @SerializedName("DataSet")
    @Expose
    private TaskStatDataItem [] DataSet;

    /**
     * Get AIGC规格。
取值有：
<li>Qwen2.0</li>
<li>Gem2.5</li>
<li>Gem3.0_1K</li>
<li>Gem3.0_2K</li>
<li>Gem3.0_4K</li>
<li>Sora2</li>
<li>Veo3.1Fast</li>
<li>Veo3.1Standard</li>
<li>Kling2.5pro_720P</li>
<li>Kling2.5pro_1080P</li>
<li>KlingO1_1080P</li>
<li>Kling2.0&2.1std_720P</li>
<li>Kling2.0&2.1pro_1080P</li>
<li>KlingO1_720P</li>
<li>Hailuo02&2.3_1080P</li>
<li>Hailuo02&2.3_768P</li>
<li>Hailuo2.3fast_768P</li>
<li>Hailuo2.3fast_1080P</li>
<li>Jimeng4.0</li>
<li>Jimeng3.0pro</li>
<li>ViduQ2_720P</li>
<li>ViduQ2_1080P</li>
<li>ViduQ2pro_720P</li>
<li>ViduQ2pro_1080P</li>
<li>ViduQ2turbo_720P</li>
<li>ViduQ2turbo_1080P</li>
<li>ViduQ2_720P_OffPeak</li>
<li>ViduQ2_1080P_OffPeak</li>
<li>ViduQ2turbo_720P_OffPeak</li>
<li>ViduQ2turbo_1080P_OffPeak</li>
<li>ViduQ2pro_720P_OffPeak</li>
<li>ViduQ2pro_1080P_OffPeak</li>
<li>Hunyuan1.5_720P</li>
<li>Hunyuan1.5_1080P</li>
<li>Hunyuan3.0_1K</li>
<li>Hunyuan3.0_2K</li>
<li>Hunyuan3.0_4K</li>
<li>Mingmou1.0_1080P</li>
<li>Mingmou1.0_1K</li>
<li>Mingmou1.0_2K</li>
<li>Mingmou1.0_4K</li>
<li>Mingmou1.0_720P</li>
<li>Seedance1.5ProAudioOn_480P</li>
<li>Seedance1.5ProAudioOff_480P</li>
<li>Seedance1.5ProAudioOn_720P</li>
<li>Seedance1.5ProAudioOff_720P</li>
<li>Seedance1.0Pro_480P</li>
<li>Seedance1.0Pro_720P</li>
<li>Seedance1.0Pro_1080P</li>
<li>Seedance1.0ProFast480P</li>
<li>Seedance1.0ProFast720P</li>
<li>Seedance1.0ProFast1080P</li>
<li>Seedance1.0Lite480P</li>
<li>Seedance1.0Lite720P</li>
<li>Seedance1.0Lite1080P</li>
<li> unknown</li> 
     * @return Specification AIGC规格。
取值有：
<li>Qwen2.0</li>
<li>Gem2.5</li>
<li>Gem3.0_1K</li>
<li>Gem3.0_2K</li>
<li>Gem3.0_4K</li>
<li>Sora2</li>
<li>Veo3.1Fast</li>
<li>Veo3.1Standard</li>
<li>Kling2.5pro_720P</li>
<li>Kling2.5pro_1080P</li>
<li>KlingO1_1080P</li>
<li>Kling2.0&2.1std_720P</li>
<li>Kling2.0&2.1pro_1080P</li>
<li>KlingO1_720P</li>
<li>Hailuo02&2.3_1080P</li>
<li>Hailuo02&2.3_768P</li>
<li>Hailuo2.3fast_768P</li>
<li>Hailuo2.3fast_1080P</li>
<li>Jimeng4.0</li>
<li>Jimeng3.0pro</li>
<li>ViduQ2_720P</li>
<li>ViduQ2_1080P</li>
<li>ViduQ2pro_720P</li>
<li>ViduQ2pro_1080P</li>
<li>ViduQ2turbo_720P</li>
<li>ViduQ2turbo_1080P</li>
<li>ViduQ2_720P_OffPeak</li>
<li>ViduQ2_1080P_OffPeak</li>
<li>ViduQ2turbo_720P_OffPeak</li>
<li>ViduQ2turbo_1080P_OffPeak</li>
<li>ViduQ2pro_720P_OffPeak</li>
<li>ViduQ2pro_1080P_OffPeak</li>
<li>Hunyuan1.5_720P</li>
<li>Hunyuan1.5_1080P</li>
<li>Hunyuan3.0_1K</li>
<li>Hunyuan3.0_2K</li>
<li>Hunyuan3.0_4K</li>
<li>Mingmou1.0_1080P</li>
<li>Mingmou1.0_1K</li>
<li>Mingmou1.0_2K</li>
<li>Mingmou1.0_4K</li>
<li>Mingmou1.0_720P</li>
<li>Seedance1.5ProAudioOn_480P</li>
<li>Seedance1.5ProAudioOff_480P</li>
<li>Seedance1.5ProAudioOn_720P</li>
<li>Seedance1.5ProAudioOff_720P</li>
<li>Seedance1.0Pro_480P</li>
<li>Seedance1.0Pro_720P</li>
<li>Seedance1.0Pro_1080P</li>
<li>Seedance1.0ProFast480P</li>
<li>Seedance1.0ProFast720P</li>
<li>Seedance1.0ProFast1080P</li>
<li>Seedance1.0Lite480P</li>
<li>Seedance1.0Lite720P</li>
<li>Seedance1.0Lite1080P</li>
<li> unknown</li>
     */
    public String getSpecification() {
        return this.Specification;
    }

    /**
     * Set AIGC规格。
取值有：
<li>Qwen2.0</li>
<li>Gem2.5</li>
<li>Gem3.0_1K</li>
<li>Gem3.0_2K</li>
<li>Gem3.0_4K</li>
<li>Sora2</li>
<li>Veo3.1Fast</li>
<li>Veo3.1Standard</li>
<li>Kling2.5pro_720P</li>
<li>Kling2.5pro_1080P</li>
<li>KlingO1_1080P</li>
<li>Kling2.0&2.1std_720P</li>
<li>Kling2.0&2.1pro_1080P</li>
<li>KlingO1_720P</li>
<li>Hailuo02&2.3_1080P</li>
<li>Hailuo02&2.3_768P</li>
<li>Hailuo2.3fast_768P</li>
<li>Hailuo2.3fast_1080P</li>
<li>Jimeng4.0</li>
<li>Jimeng3.0pro</li>
<li>ViduQ2_720P</li>
<li>ViduQ2_1080P</li>
<li>ViduQ2pro_720P</li>
<li>ViduQ2pro_1080P</li>
<li>ViduQ2turbo_720P</li>
<li>ViduQ2turbo_1080P</li>
<li>ViduQ2_720P_OffPeak</li>
<li>ViduQ2_1080P_OffPeak</li>
<li>ViduQ2turbo_720P_OffPeak</li>
<li>ViduQ2turbo_1080P_OffPeak</li>
<li>ViduQ2pro_720P_OffPeak</li>
<li>ViduQ2pro_1080P_OffPeak</li>
<li>Hunyuan1.5_720P</li>
<li>Hunyuan1.5_1080P</li>
<li>Hunyuan3.0_1K</li>
<li>Hunyuan3.0_2K</li>
<li>Hunyuan3.0_4K</li>
<li>Mingmou1.0_1080P</li>
<li>Mingmou1.0_1K</li>
<li>Mingmou1.0_2K</li>
<li>Mingmou1.0_4K</li>
<li>Mingmou1.0_720P</li>
<li>Seedance1.5ProAudioOn_480P</li>
<li>Seedance1.5ProAudioOff_480P</li>
<li>Seedance1.5ProAudioOn_720P</li>
<li>Seedance1.5ProAudioOff_720P</li>
<li>Seedance1.0Pro_480P</li>
<li>Seedance1.0Pro_720P</li>
<li>Seedance1.0Pro_1080P</li>
<li>Seedance1.0ProFast480P</li>
<li>Seedance1.0ProFast720P</li>
<li>Seedance1.0ProFast1080P</li>
<li>Seedance1.0Lite480P</li>
<li>Seedance1.0Lite720P</li>
<li>Seedance1.0Lite1080P</li>
<li> unknown</li>
     * @param Specification AIGC规格。
取值有：
<li>Qwen2.0</li>
<li>Gem2.5</li>
<li>Gem3.0_1K</li>
<li>Gem3.0_2K</li>
<li>Gem3.0_4K</li>
<li>Sora2</li>
<li>Veo3.1Fast</li>
<li>Veo3.1Standard</li>
<li>Kling2.5pro_720P</li>
<li>Kling2.5pro_1080P</li>
<li>KlingO1_1080P</li>
<li>Kling2.0&2.1std_720P</li>
<li>Kling2.0&2.1pro_1080P</li>
<li>KlingO1_720P</li>
<li>Hailuo02&2.3_1080P</li>
<li>Hailuo02&2.3_768P</li>
<li>Hailuo2.3fast_768P</li>
<li>Hailuo2.3fast_1080P</li>
<li>Jimeng4.0</li>
<li>Jimeng3.0pro</li>
<li>ViduQ2_720P</li>
<li>ViduQ2_1080P</li>
<li>ViduQ2pro_720P</li>
<li>ViduQ2pro_1080P</li>
<li>ViduQ2turbo_720P</li>
<li>ViduQ2turbo_1080P</li>
<li>ViduQ2_720P_OffPeak</li>
<li>ViduQ2_1080P_OffPeak</li>
<li>ViduQ2turbo_720P_OffPeak</li>
<li>ViduQ2turbo_1080P_OffPeak</li>
<li>ViduQ2pro_720P_OffPeak</li>
<li>ViduQ2pro_1080P_OffPeak</li>
<li>Hunyuan1.5_720P</li>
<li>Hunyuan1.5_1080P</li>
<li>Hunyuan3.0_1K</li>
<li>Hunyuan3.0_2K</li>
<li>Hunyuan3.0_4K</li>
<li>Mingmou1.0_1080P</li>
<li>Mingmou1.0_1K</li>
<li>Mingmou1.0_2K</li>
<li>Mingmou1.0_4K</li>
<li>Mingmou1.0_720P</li>
<li>Seedance1.5ProAudioOn_480P</li>
<li>Seedance1.5ProAudioOff_480P</li>
<li>Seedance1.5ProAudioOn_720P</li>
<li>Seedance1.5ProAudioOff_720P</li>
<li>Seedance1.0Pro_480P</li>
<li>Seedance1.0Pro_720P</li>
<li>Seedance1.0Pro_1080P</li>
<li>Seedance1.0ProFast480P</li>
<li>Seedance1.0ProFast720P</li>
<li>Seedance1.0ProFast1080P</li>
<li>Seedance1.0Lite480P</li>
<li>Seedance1.0Lite720P</li>
<li>Seedance1.0Lite1080P</li>
<li> unknown</li>
     */
    public void setSpecification(String Specification) {
        this.Specification = Specification;
    }

    /**
     * Get 用量数据。 
     * @return DataSet 用量数据。
     */
    public TaskStatDataItem [] getDataSet() {
        return this.DataSet;
    }

    /**
     * Set 用量数据。
     * @param DataSet 用量数据。
     */
    public void setDataSet(TaskStatDataItem [] DataSet) {
        this.DataSet = DataSet;
    }

    public AigcUsageDataItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AigcUsageDataItem(AigcUsageDataItem source) {
        if (source.Specification != null) {
            this.Specification = new String(source.Specification);
        }
        if (source.DataSet != null) {
            this.DataSet = new TaskStatDataItem[source.DataSet.length];
            for (int i = 0; i < source.DataSet.length; i++) {
                this.DataSet[i] = new TaskStatDataItem(source.DataSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Specification", this.Specification);
        this.setParamArrayObj(map, prefix + "DataSet.", this.DataSet);

    }
}

