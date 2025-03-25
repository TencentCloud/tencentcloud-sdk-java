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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class KubeJarvisStateDiagnosticOverview extends AbstractModel {

    /**
    * 诊断目录
    */
    @SerializedName("Catalogues")
    @Expose
    private KubeJarvisStateCatalogue [] Catalogues;

    /**
    * 诊断结果统计
    */
    @SerializedName("Statistics")
    @Expose
    private KubeJarvisStateStatistic [] Statistics;

    /**
     * Get 诊断目录 
     * @return Catalogues 诊断目录
     */
    public KubeJarvisStateCatalogue [] getCatalogues() {
        return this.Catalogues;
    }

    /**
     * Set 诊断目录
     * @param Catalogues 诊断目录
     */
    public void setCatalogues(KubeJarvisStateCatalogue [] Catalogues) {
        this.Catalogues = Catalogues;
    }

    /**
     * Get 诊断结果统计 
     * @return Statistics 诊断结果统计
     */
    public KubeJarvisStateStatistic [] getStatistics() {
        return this.Statistics;
    }

    /**
     * Set 诊断结果统计
     * @param Statistics 诊断结果统计
     */
    public void setStatistics(KubeJarvisStateStatistic [] Statistics) {
        this.Statistics = Statistics;
    }

    public KubeJarvisStateDiagnosticOverview() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KubeJarvisStateDiagnosticOverview(KubeJarvisStateDiagnosticOverview source) {
        if (source.Catalogues != null) {
            this.Catalogues = new KubeJarvisStateCatalogue[source.Catalogues.length];
            for (int i = 0; i < source.Catalogues.length; i++) {
                this.Catalogues[i] = new KubeJarvisStateCatalogue(source.Catalogues[i]);
            }
        }
        if (source.Statistics != null) {
            this.Statistics = new KubeJarvisStateStatistic[source.Statistics.length];
            for (int i = 0; i < source.Statistics.length; i++) {
                this.Statistics[i] = new KubeJarvisStateStatistic(source.Statistics[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Catalogues.", this.Catalogues);
        this.setParamArrayObj(map, prefix + "Statistics.", this.Statistics);

    }
}

