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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeUsageDataRequest extends AbstractModel {

    /**
    * <p>起始日期。使用 ISO 日期格式。</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>结束日期，需大于等于起始日期。使用<a href="https://cloud.tencent.com/document/product/862/37710#52">ISO 日期格式</a>。</p><p>参数格式：2019-07-16T06:21:28Z</p>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>查询媒体处理任务类型，默认查询转码。</p><li>Transcode：转码</li><li>Enhance：增强</li><li>AIAnalysis：智能分析</li><li>AIRecognition：智能识别</li><li>AIReview：内容审核</li><li>Snapshot：截图</li><li>AnimatedGraphics：转动图</li><li>AiQualityControl：质检</li><li>Evaluation：视频评测</li><li>ImageProcess: 图片处理</li><li>AddBlindWatermark: 添加基础版权数字水印</li><li>AddNagraWatermark: 添加NAGRA数字水印</li><li>ExtractBlindWatermark: 提取基础版权数字水印</li><li>AIGCVideo: AIGC视频生成</li><li>AIGCImage: AIGC图片生成</li>
    */
    @SerializedName("Types")
    @Expose
    private String [] Types;

    /**
    * <p>媒体处理园区，默认返回 ap-guangzhou 园区。</p><li>ap-guangzhou：广州</li><li>ap-hongkong：中国香港</li><li>ap-taipei：中国台北</li><li>ap-singapore：新加坡</li><li>ap-mumbai：印度</li><li>ap-jakarta：雅加达</li><li>ap-seoul：首尔</li><li>ap-bangkok：泰国</li><li>ap-tokyo：日本</li><li>na-siliconvalley：美国硅谷</li><li>na-ashburn：弗吉尼亚</li><li>na-toronto：多伦多</li><li>sa-saopaulo：圣保罗</li><li>eu-frankfurt：法兰克福</li><li>eu-moscow：俄罗斯</li><li>aws：AWS</li>
    */
    @SerializedName("ProcessRegions")
    @Expose
    private String [] ProcessRegions;

    /**
     * Get <p>起始日期。使用 ISO 日期格式。</p> 
     * @return StartTime <p>起始日期。使用 ISO 日期格式。</p>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>起始日期。使用 ISO 日期格式。</p>
     * @param StartTime <p>起始日期。使用 ISO 日期格式。</p>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>结束日期，需大于等于起始日期。使用<a href="https://cloud.tencent.com/document/product/862/37710#52">ISO 日期格式</a>。</p><p>参数格式：2019-07-16T06:21:28Z</p> 
     * @return EndTime <p>结束日期，需大于等于起始日期。使用<a href="https://cloud.tencent.com/document/product/862/37710#52">ISO 日期格式</a>。</p><p>参数格式：2019-07-16T06:21:28Z</p>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>结束日期，需大于等于起始日期。使用<a href="https://cloud.tencent.com/document/product/862/37710#52">ISO 日期格式</a>。</p><p>参数格式：2019-07-16T06:21:28Z</p>
     * @param EndTime <p>结束日期，需大于等于起始日期。使用<a href="https://cloud.tencent.com/document/product/862/37710#52">ISO 日期格式</a>。</p><p>参数格式：2019-07-16T06:21:28Z</p>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>查询媒体处理任务类型，默认查询转码。</p><li>Transcode：转码</li><li>Enhance：增强</li><li>AIAnalysis：智能分析</li><li>AIRecognition：智能识别</li><li>AIReview：内容审核</li><li>Snapshot：截图</li><li>AnimatedGraphics：转动图</li><li>AiQualityControl：质检</li><li>Evaluation：视频评测</li><li>ImageProcess: 图片处理</li><li>AddBlindWatermark: 添加基础版权数字水印</li><li>AddNagraWatermark: 添加NAGRA数字水印</li><li>ExtractBlindWatermark: 提取基础版权数字水印</li><li>AIGCVideo: AIGC视频生成</li><li>AIGCImage: AIGC图片生成</li> 
     * @return Types <p>查询媒体处理任务类型，默认查询转码。</p><li>Transcode：转码</li><li>Enhance：增强</li><li>AIAnalysis：智能分析</li><li>AIRecognition：智能识别</li><li>AIReview：内容审核</li><li>Snapshot：截图</li><li>AnimatedGraphics：转动图</li><li>AiQualityControl：质检</li><li>Evaluation：视频评测</li><li>ImageProcess: 图片处理</li><li>AddBlindWatermark: 添加基础版权数字水印</li><li>AddNagraWatermark: 添加NAGRA数字水印</li><li>ExtractBlindWatermark: 提取基础版权数字水印</li><li>AIGCVideo: AIGC视频生成</li><li>AIGCImage: AIGC图片生成</li>
     */
    public String [] getTypes() {
        return this.Types;
    }

    /**
     * Set <p>查询媒体处理任务类型，默认查询转码。</p><li>Transcode：转码</li><li>Enhance：增强</li><li>AIAnalysis：智能分析</li><li>AIRecognition：智能识别</li><li>AIReview：内容审核</li><li>Snapshot：截图</li><li>AnimatedGraphics：转动图</li><li>AiQualityControl：质检</li><li>Evaluation：视频评测</li><li>ImageProcess: 图片处理</li><li>AddBlindWatermark: 添加基础版权数字水印</li><li>AddNagraWatermark: 添加NAGRA数字水印</li><li>ExtractBlindWatermark: 提取基础版权数字水印</li><li>AIGCVideo: AIGC视频生成</li><li>AIGCImage: AIGC图片生成</li>
     * @param Types <p>查询媒体处理任务类型，默认查询转码。</p><li>Transcode：转码</li><li>Enhance：增强</li><li>AIAnalysis：智能分析</li><li>AIRecognition：智能识别</li><li>AIReview：内容审核</li><li>Snapshot：截图</li><li>AnimatedGraphics：转动图</li><li>AiQualityControl：质检</li><li>Evaluation：视频评测</li><li>ImageProcess: 图片处理</li><li>AddBlindWatermark: 添加基础版权数字水印</li><li>AddNagraWatermark: 添加NAGRA数字水印</li><li>ExtractBlindWatermark: 提取基础版权数字水印</li><li>AIGCVideo: AIGC视频生成</li><li>AIGCImage: AIGC图片生成</li>
     */
    public void setTypes(String [] Types) {
        this.Types = Types;
    }

    /**
     * Get <p>媒体处理园区，默认返回 ap-guangzhou 园区。</p><li>ap-guangzhou：广州</li><li>ap-hongkong：中国香港</li><li>ap-taipei：中国台北</li><li>ap-singapore：新加坡</li><li>ap-mumbai：印度</li><li>ap-jakarta：雅加达</li><li>ap-seoul：首尔</li><li>ap-bangkok：泰国</li><li>ap-tokyo：日本</li><li>na-siliconvalley：美国硅谷</li><li>na-ashburn：弗吉尼亚</li><li>na-toronto：多伦多</li><li>sa-saopaulo：圣保罗</li><li>eu-frankfurt：法兰克福</li><li>eu-moscow：俄罗斯</li><li>aws：AWS</li> 
     * @return ProcessRegions <p>媒体处理园区，默认返回 ap-guangzhou 园区。</p><li>ap-guangzhou：广州</li><li>ap-hongkong：中国香港</li><li>ap-taipei：中国台北</li><li>ap-singapore：新加坡</li><li>ap-mumbai：印度</li><li>ap-jakarta：雅加达</li><li>ap-seoul：首尔</li><li>ap-bangkok：泰国</li><li>ap-tokyo：日本</li><li>na-siliconvalley：美国硅谷</li><li>na-ashburn：弗吉尼亚</li><li>na-toronto：多伦多</li><li>sa-saopaulo：圣保罗</li><li>eu-frankfurt：法兰克福</li><li>eu-moscow：俄罗斯</li><li>aws：AWS</li>
     */
    public String [] getProcessRegions() {
        return this.ProcessRegions;
    }

    /**
     * Set <p>媒体处理园区，默认返回 ap-guangzhou 园区。</p><li>ap-guangzhou：广州</li><li>ap-hongkong：中国香港</li><li>ap-taipei：中国台北</li><li>ap-singapore：新加坡</li><li>ap-mumbai：印度</li><li>ap-jakarta：雅加达</li><li>ap-seoul：首尔</li><li>ap-bangkok：泰国</li><li>ap-tokyo：日本</li><li>na-siliconvalley：美国硅谷</li><li>na-ashburn：弗吉尼亚</li><li>na-toronto：多伦多</li><li>sa-saopaulo：圣保罗</li><li>eu-frankfurt：法兰克福</li><li>eu-moscow：俄罗斯</li><li>aws：AWS</li>
     * @param ProcessRegions <p>媒体处理园区，默认返回 ap-guangzhou 园区。</p><li>ap-guangzhou：广州</li><li>ap-hongkong：中国香港</li><li>ap-taipei：中国台北</li><li>ap-singapore：新加坡</li><li>ap-mumbai：印度</li><li>ap-jakarta：雅加达</li><li>ap-seoul：首尔</li><li>ap-bangkok：泰国</li><li>ap-tokyo：日本</li><li>na-siliconvalley：美国硅谷</li><li>na-ashburn：弗吉尼亚</li><li>na-toronto：多伦多</li><li>sa-saopaulo：圣保罗</li><li>eu-frankfurt：法兰克福</li><li>eu-moscow：俄罗斯</li><li>aws：AWS</li>
     */
    public void setProcessRegions(String [] ProcessRegions) {
        this.ProcessRegions = ProcessRegions;
    }

    public DescribeUsageDataRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeUsageDataRequest(DescribeUsageDataRequest source) {
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Types != null) {
            this.Types = new String[source.Types.length];
            for (int i = 0; i < source.Types.length; i++) {
                this.Types[i] = new String(source.Types[i]);
            }
        }
        if (source.ProcessRegions != null) {
            this.ProcessRegions = new String[source.ProcessRegions.length];
            for (int i = 0; i < source.ProcessRegions.length; i++) {
                this.ProcessRegions[i] = new String(source.ProcessRegions[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamArraySimple(map, prefix + "Types.", this.Types);
        this.setParamArraySimple(map, prefix + "ProcessRegions.", this.ProcessRegions);

    }
}

