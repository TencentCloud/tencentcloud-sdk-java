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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PrometheusTarget extends AbstractModel{

    /**
    * 抓取目标的URL
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * target当前状态,当前支持
up = 健康
down = 不健康
unknown = 未知
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * target的元label
    */
    @SerializedName("Labels")
    @Expose
    private Label [] Labels;

    /**
    * 上一次抓取的时间
    */
    @SerializedName("LastScrape")
    @Expose
    private String LastScrape;

    /**
    * 上一次抓取的耗时，单位是s
    */
    @SerializedName("ScrapeDuration")
    @Expose
    private Float ScrapeDuration;

    /**
    * 上一次抓取如果错误，该字段存储错误信息
    */
    @SerializedName("Error")
    @Expose
    private String Error;

    /**
     * Get 抓取目标的URL 
     * @return Url 抓取目标的URL
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 抓取目标的URL
     * @param Url 抓取目标的URL
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get target当前状态,当前支持
up = 健康
down = 不健康
unknown = 未知 
     * @return State target当前状态,当前支持
up = 健康
down = 不健康
unknown = 未知
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set target当前状态,当前支持
up = 健康
down = 不健康
unknown = 未知
     * @param State target当前状态,当前支持
up = 健康
down = 不健康
unknown = 未知
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get target的元label 
     * @return Labels target的元label
     */
    public Label [] getLabels() {
        return this.Labels;
    }

    /**
     * Set target的元label
     * @param Labels target的元label
     */
    public void setLabels(Label [] Labels) {
        this.Labels = Labels;
    }

    /**
     * Get 上一次抓取的时间 
     * @return LastScrape 上一次抓取的时间
     */
    public String getLastScrape() {
        return this.LastScrape;
    }

    /**
     * Set 上一次抓取的时间
     * @param LastScrape 上一次抓取的时间
     */
    public void setLastScrape(String LastScrape) {
        this.LastScrape = LastScrape;
    }

    /**
     * Get 上一次抓取的耗时，单位是s 
     * @return ScrapeDuration 上一次抓取的耗时，单位是s
     */
    public Float getScrapeDuration() {
        return this.ScrapeDuration;
    }

    /**
     * Set 上一次抓取的耗时，单位是s
     * @param ScrapeDuration 上一次抓取的耗时，单位是s
     */
    public void setScrapeDuration(Float ScrapeDuration) {
        this.ScrapeDuration = ScrapeDuration;
    }

    /**
     * Get 上一次抓取如果错误，该字段存储错误信息 
     * @return Error 上一次抓取如果错误，该字段存储错误信息
     */
    public String getError() {
        return this.Error;
    }

    /**
     * Set 上一次抓取如果错误，该字段存储错误信息
     * @param Error 上一次抓取如果错误，该字段存储错误信息
     */
    public void setError(String Error) {
        this.Error = Error;
    }

    public PrometheusTarget() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PrometheusTarget(PrometheusTarget source) {
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.State != null) {
            this.State = new String(source.State);
        }
        if (source.Labels != null) {
            this.Labels = new Label[source.Labels.length];
            for (int i = 0; i < source.Labels.length; i++) {
                this.Labels[i] = new Label(source.Labels[i]);
            }
        }
        if (source.LastScrape != null) {
            this.LastScrape = new String(source.LastScrape);
        }
        if (source.ScrapeDuration != null) {
            this.ScrapeDuration = new Float(source.ScrapeDuration);
        }
        if (source.Error != null) {
            this.Error = new String(source.Error);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamArrayObj(map, prefix + "Labels.", this.Labels);
        this.setParamSimple(map, prefix + "LastScrape", this.LastScrape);
        this.setParamSimple(map, prefix + "ScrapeDuration", this.ScrapeDuration);
        this.setParamSimple(map, prefix + "Error", this.Error);

    }
}

