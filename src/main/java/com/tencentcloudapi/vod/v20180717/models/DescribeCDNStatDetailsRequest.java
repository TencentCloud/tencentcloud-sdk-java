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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCDNStatDetailsRequest extends AbstractModel{

    /**
    * 查询指标，取值有：
<li>Traffic：流量，单位为 Byte。</li>
<li>Bandwidth：带宽，单位为 Bps。</li>
<li>Requests：请求数。</li>
    */
    @SerializedName("Metric")
    @Expose
    private String Metric;

    /**
    * 起始时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 结束时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 域名列表。一次最多查询20个域名的数据。默认返回所有域名叠加的用量数据。
    */
    @SerializedName("DomainNames")
    @Expose
    private String [] DomainNames;

    /**
    * 服务区域，取值有：
<li>Chinese Mainland：中国大陆。 </li>
<li>Asia Pacific Region 1：亚太一区，包括中国香港、中国澳门、新加坡、越南、泰国。 </li>
<li>Asia Pacific Region 2：亚太二区，包括中国台湾、日本、马来西亚、印度尼西亚、韩国。 </li>
<li>Asia Pacific Region 3：亚太三区，包括菲律宾、印度、澳大利亚和亚太其它国家和地区。 </li>
<li>Middle East：中东。 </li>
<li>Europe：欧洲。</li>
<li>North America：北美。</li>
<li>South America：南美。</li>
<li>Africa：非洲。</li>
默认为中国大陆。
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * 用户所在地区，Area 为 Chinese Mainland 时，取值为以下地区信息，当 Area 为其它值时， 忽略 Districts 参数。
<li>Beijing：北京。</li>
<li>Inner Mongolia：内蒙古。</li>
<li>Shanxi：山西。</li>
<li>Hebei：河北。</li>
<li>Tianjin：天津。</li>
<li>Ningxia：宁夏。</li>
<li>Shaanxi：陕西。</li>
<li>Gansu：甘肃。</li>
<li>Qinghai：青海。</li>
<li>Xinjiang：新疆。</li>
<li>Heilongjiang：黑龙江。</li>
<li>Jilin：吉林。</li>
<li>Liaoning：辽宁。</li>
<li>Fujian：福建。</li>
<li>Jiangsu：江苏。</li>
<li>Anhui：安徽。</li>
<li>Shandong：山东。</li>
<li>Shanghai：上海。</li>
<li>Zhejiang：浙江。</li>
<li>Henan：河南。</li>
<li>Hubei：湖北。</li>
<li>Jiangxi：江西。</li>
<li>Hunan：湖南。</li>
<li>Guizhou：贵州。</li>
<li>Yunnan：云南。</li>
<li>Chongqing：重庆。</li>
<li>Sichuan：四川。</li>
<li>Tibet：西藏。</li>
<li>Guangdong：广东。</li>
<li>Guangxi：广西。</li>
<li>Hainan：海南。</li>
<li>Hong Kong, Macao and Taiwan：港澳台。</li>
<li>Outside Chinese Mainland：海外。</li>
<li>Other：其他 。</li>
    */
    @SerializedName("Districts")
    @Expose
    private String [] Districts;

    /**
    * 用户所属运营商信息，Area 为 Chinese Mainland 时，取值为以下运营商信息。当 Area 为其它值时忽略 Isps 参数。
<li>China Telecom：中国电信。 </li>
<li>China Unicom：中国联通。 </li>
<li>CERNET：教育网。</li>
<li>Great Wall Broadband Network：长城宽带。</li>
<li>China Mobile：中国移动。</li>
<li>China Mobile Tietong：中国铁通。</li>
<li>ISPs outside Chinese Mainland：海外运营商。</li>
<li>Other ISPs：其他运营商。</li>
    */
    @SerializedName("Isps")
    @Expose
    private String [] Isps;

    /**
    * 每条数据的时间粒度，单位：分钟，取值有：
<li>5：5 分钟粒度，返回指定查询时间内5分钟粒度的明细数据。</li>
<li>1440：天粒度，返回指定查询时间内1天粒度的数据。起始时间和结束时间跨度大于24小时，只支持天粒度的数据。</li>
当 StartTime 和 EndTime 时间跨度大于24小时时，DataInterval 默认为 1440。
    */
    @SerializedName("DataInterval")
    @Expose
    private Long DataInterval;

    /**
    * 点播[子应用](/document/product/266/14574) ID。如果要访问子应用中的资源，则将该字段填写为子应用 ID；否则无需填写该字段。
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
     * Get 查询指标，取值有：
<li>Traffic：流量，单位为 Byte。</li>
<li>Bandwidth：带宽，单位为 Bps。</li>
<li>Requests：请求数。</li> 
     * @return Metric 查询指标，取值有：
<li>Traffic：流量，单位为 Byte。</li>
<li>Bandwidth：带宽，单位为 Bps。</li>
<li>Requests：请求数。</li>
     */
    public String getMetric() {
        return this.Metric;
    }

    /**
     * Set 查询指标，取值有：
<li>Traffic：流量，单位为 Byte。</li>
<li>Bandwidth：带宽，单位为 Bps。</li>
<li>Requests：请求数。</li>
     * @param Metric 查询指标，取值有：
<li>Traffic：流量，单位为 Byte。</li>
<li>Bandwidth：带宽，单位为 Bps。</li>
<li>Requests：请求数。</li>
     */
    public void setMetric(String Metric) {
        this.Metric = Metric;
    }

    /**
     * Get 起始时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。 
     * @return StartTime 起始时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 起始时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
     * @param StartTime 起始时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。 
     * @return EndTime 结束时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
     * @param EndTime 结束时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 域名列表。一次最多查询20个域名的数据。默认返回所有域名叠加的用量数据。 
     * @return DomainNames 域名列表。一次最多查询20个域名的数据。默认返回所有域名叠加的用量数据。
     */
    public String [] getDomainNames() {
        return this.DomainNames;
    }

    /**
     * Set 域名列表。一次最多查询20个域名的数据。默认返回所有域名叠加的用量数据。
     * @param DomainNames 域名列表。一次最多查询20个域名的数据。默认返回所有域名叠加的用量数据。
     */
    public void setDomainNames(String [] DomainNames) {
        this.DomainNames = DomainNames;
    }

    /**
     * Get 服务区域，取值有：
<li>Chinese Mainland：中国大陆。 </li>
<li>Asia Pacific Region 1：亚太一区，包括中国香港、中国澳门、新加坡、越南、泰国。 </li>
<li>Asia Pacific Region 2：亚太二区，包括中国台湾、日本、马来西亚、印度尼西亚、韩国。 </li>
<li>Asia Pacific Region 3：亚太三区，包括菲律宾、印度、澳大利亚和亚太其它国家和地区。 </li>
<li>Middle East：中东。 </li>
<li>Europe：欧洲。</li>
<li>North America：北美。</li>
<li>South America：南美。</li>
<li>Africa：非洲。</li>
默认为中国大陆。 
     * @return Area 服务区域，取值有：
<li>Chinese Mainland：中国大陆。 </li>
<li>Asia Pacific Region 1：亚太一区，包括中国香港、中国澳门、新加坡、越南、泰国。 </li>
<li>Asia Pacific Region 2：亚太二区，包括中国台湾、日本、马来西亚、印度尼西亚、韩国。 </li>
<li>Asia Pacific Region 3：亚太三区，包括菲律宾、印度、澳大利亚和亚太其它国家和地区。 </li>
<li>Middle East：中东。 </li>
<li>Europe：欧洲。</li>
<li>North America：北美。</li>
<li>South America：南美。</li>
<li>Africa：非洲。</li>
默认为中国大陆。
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set 服务区域，取值有：
<li>Chinese Mainland：中国大陆。 </li>
<li>Asia Pacific Region 1：亚太一区，包括中国香港、中国澳门、新加坡、越南、泰国。 </li>
<li>Asia Pacific Region 2：亚太二区，包括中国台湾、日本、马来西亚、印度尼西亚、韩国。 </li>
<li>Asia Pacific Region 3：亚太三区，包括菲律宾、印度、澳大利亚和亚太其它国家和地区。 </li>
<li>Middle East：中东。 </li>
<li>Europe：欧洲。</li>
<li>North America：北美。</li>
<li>South America：南美。</li>
<li>Africa：非洲。</li>
默认为中国大陆。
     * @param Area 服务区域，取值有：
<li>Chinese Mainland：中国大陆。 </li>
<li>Asia Pacific Region 1：亚太一区，包括中国香港、中国澳门、新加坡、越南、泰国。 </li>
<li>Asia Pacific Region 2：亚太二区，包括中国台湾、日本、马来西亚、印度尼西亚、韩国。 </li>
<li>Asia Pacific Region 3：亚太三区，包括菲律宾、印度、澳大利亚和亚太其它国家和地区。 </li>
<li>Middle East：中东。 </li>
<li>Europe：欧洲。</li>
<li>North America：北美。</li>
<li>South America：南美。</li>
<li>Africa：非洲。</li>
默认为中国大陆。
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Get 用户所在地区，Area 为 Chinese Mainland 时，取值为以下地区信息，当 Area 为其它值时， 忽略 Districts 参数。
<li>Beijing：北京。</li>
<li>Inner Mongolia：内蒙古。</li>
<li>Shanxi：山西。</li>
<li>Hebei：河北。</li>
<li>Tianjin：天津。</li>
<li>Ningxia：宁夏。</li>
<li>Shaanxi：陕西。</li>
<li>Gansu：甘肃。</li>
<li>Qinghai：青海。</li>
<li>Xinjiang：新疆。</li>
<li>Heilongjiang：黑龙江。</li>
<li>Jilin：吉林。</li>
<li>Liaoning：辽宁。</li>
<li>Fujian：福建。</li>
<li>Jiangsu：江苏。</li>
<li>Anhui：安徽。</li>
<li>Shandong：山东。</li>
<li>Shanghai：上海。</li>
<li>Zhejiang：浙江。</li>
<li>Henan：河南。</li>
<li>Hubei：湖北。</li>
<li>Jiangxi：江西。</li>
<li>Hunan：湖南。</li>
<li>Guizhou：贵州。</li>
<li>Yunnan：云南。</li>
<li>Chongqing：重庆。</li>
<li>Sichuan：四川。</li>
<li>Tibet：西藏。</li>
<li>Guangdong：广东。</li>
<li>Guangxi：广西。</li>
<li>Hainan：海南。</li>
<li>Hong Kong, Macao and Taiwan：港澳台。</li>
<li>Outside Chinese Mainland：海外。</li>
<li>Other：其他 。</li> 
     * @return Districts 用户所在地区，Area 为 Chinese Mainland 时，取值为以下地区信息，当 Area 为其它值时， 忽略 Districts 参数。
<li>Beijing：北京。</li>
<li>Inner Mongolia：内蒙古。</li>
<li>Shanxi：山西。</li>
<li>Hebei：河北。</li>
<li>Tianjin：天津。</li>
<li>Ningxia：宁夏。</li>
<li>Shaanxi：陕西。</li>
<li>Gansu：甘肃。</li>
<li>Qinghai：青海。</li>
<li>Xinjiang：新疆。</li>
<li>Heilongjiang：黑龙江。</li>
<li>Jilin：吉林。</li>
<li>Liaoning：辽宁。</li>
<li>Fujian：福建。</li>
<li>Jiangsu：江苏。</li>
<li>Anhui：安徽。</li>
<li>Shandong：山东。</li>
<li>Shanghai：上海。</li>
<li>Zhejiang：浙江。</li>
<li>Henan：河南。</li>
<li>Hubei：湖北。</li>
<li>Jiangxi：江西。</li>
<li>Hunan：湖南。</li>
<li>Guizhou：贵州。</li>
<li>Yunnan：云南。</li>
<li>Chongqing：重庆。</li>
<li>Sichuan：四川。</li>
<li>Tibet：西藏。</li>
<li>Guangdong：广东。</li>
<li>Guangxi：广西。</li>
<li>Hainan：海南。</li>
<li>Hong Kong, Macao and Taiwan：港澳台。</li>
<li>Outside Chinese Mainland：海外。</li>
<li>Other：其他 。</li>
     */
    public String [] getDistricts() {
        return this.Districts;
    }

    /**
     * Set 用户所在地区，Area 为 Chinese Mainland 时，取值为以下地区信息，当 Area 为其它值时， 忽略 Districts 参数。
<li>Beijing：北京。</li>
<li>Inner Mongolia：内蒙古。</li>
<li>Shanxi：山西。</li>
<li>Hebei：河北。</li>
<li>Tianjin：天津。</li>
<li>Ningxia：宁夏。</li>
<li>Shaanxi：陕西。</li>
<li>Gansu：甘肃。</li>
<li>Qinghai：青海。</li>
<li>Xinjiang：新疆。</li>
<li>Heilongjiang：黑龙江。</li>
<li>Jilin：吉林。</li>
<li>Liaoning：辽宁。</li>
<li>Fujian：福建。</li>
<li>Jiangsu：江苏。</li>
<li>Anhui：安徽。</li>
<li>Shandong：山东。</li>
<li>Shanghai：上海。</li>
<li>Zhejiang：浙江。</li>
<li>Henan：河南。</li>
<li>Hubei：湖北。</li>
<li>Jiangxi：江西。</li>
<li>Hunan：湖南。</li>
<li>Guizhou：贵州。</li>
<li>Yunnan：云南。</li>
<li>Chongqing：重庆。</li>
<li>Sichuan：四川。</li>
<li>Tibet：西藏。</li>
<li>Guangdong：广东。</li>
<li>Guangxi：广西。</li>
<li>Hainan：海南。</li>
<li>Hong Kong, Macao and Taiwan：港澳台。</li>
<li>Outside Chinese Mainland：海外。</li>
<li>Other：其他 。</li>
     * @param Districts 用户所在地区，Area 为 Chinese Mainland 时，取值为以下地区信息，当 Area 为其它值时， 忽略 Districts 参数。
<li>Beijing：北京。</li>
<li>Inner Mongolia：内蒙古。</li>
<li>Shanxi：山西。</li>
<li>Hebei：河北。</li>
<li>Tianjin：天津。</li>
<li>Ningxia：宁夏。</li>
<li>Shaanxi：陕西。</li>
<li>Gansu：甘肃。</li>
<li>Qinghai：青海。</li>
<li>Xinjiang：新疆。</li>
<li>Heilongjiang：黑龙江。</li>
<li>Jilin：吉林。</li>
<li>Liaoning：辽宁。</li>
<li>Fujian：福建。</li>
<li>Jiangsu：江苏。</li>
<li>Anhui：安徽。</li>
<li>Shandong：山东。</li>
<li>Shanghai：上海。</li>
<li>Zhejiang：浙江。</li>
<li>Henan：河南。</li>
<li>Hubei：湖北。</li>
<li>Jiangxi：江西。</li>
<li>Hunan：湖南。</li>
<li>Guizhou：贵州。</li>
<li>Yunnan：云南。</li>
<li>Chongqing：重庆。</li>
<li>Sichuan：四川。</li>
<li>Tibet：西藏。</li>
<li>Guangdong：广东。</li>
<li>Guangxi：广西。</li>
<li>Hainan：海南。</li>
<li>Hong Kong, Macao and Taiwan：港澳台。</li>
<li>Outside Chinese Mainland：海外。</li>
<li>Other：其他 。</li>
     */
    public void setDistricts(String [] Districts) {
        this.Districts = Districts;
    }

    /**
     * Get 用户所属运营商信息，Area 为 Chinese Mainland 时，取值为以下运营商信息。当 Area 为其它值时忽略 Isps 参数。
<li>China Telecom：中国电信。 </li>
<li>China Unicom：中国联通。 </li>
<li>CERNET：教育网。</li>
<li>Great Wall Broadband Network：长城宽带。</li>
<li>China Mobile：中国移动。</li>
<li>China Mobile Tietong：中国铁通。</li>
<li>ISPs outside Chinese Mainland：海外运营商。</li>
<li>Other ISPs：其他运营商。</li> 
     * @return Isps 用户所属运营商信息，Area 为 Chinese Mainland 时，取值为以下运营商信息。当 Area 为其它值时忽略 Isps 参数。
<li>China Telecom：中国电信。 </li>
<li>China Unicom：中国联通。 </li>
<li>CERNET：教育网。</li>
<li>Great Wall Broadband Network：长城宽带。</li>
<li>China Mobile：中国移动。</li>
<li>China Mobile Tietong：中国铁通。</li>
<li>ISPs outside Chinese Mainland：海外运营商。</li>
<li>Other ISPs：其他运营商。</li>
     */
    public String [] getIsps() {
        return this.Isps;
    }

    /**
     * Set 用户所属运营商信息，Area 为 Chinese Mainland 时，取值为以下运营商信息。当 Area 为其它值时忽略 Isps 参数。
<li>China Telecom：中国电信。 </li>
<li>China Unicom：中国联通。 </li>
<li>CERNET：教育网。</li>
<li>Great Wall Broadband Network：长城宽带。</li>
<li>China Mobile：中国移动。</li>
<li>China Mobile Tietong：中国铁通。</li>
<li>ISPs outside Chinese Mainland：海外运营商。</li>
<li>Other ISPs：其他运营商。</li>
     * @param Isps 用户所属运营商信息，Area 为 Chinese Mainland 时，取值为以下运营商信息。当 Area 为其它值时忽略 Isps 参数。
<li>China Telecom：中国电信。 </li>
<li>China Unicom：中国联通。 </li>
<li>CERNET：教育网。</li>
<li>Great Wall Broadband Network：长城宽带。</li>
<li>China Mobile：中国移动。</li>
<li>China Mobile Tietong：中国铁通。</li>
<li>ISPs outside Chinese Mainland：海外运营商。</li>
<li>Other ISPs：其他运营商。</li>
     */
    public void setIsps(String [] Isps) {
        this.Isps = Isps;
    }

    /**
     * Get 每条数据的时间粒度，单位：分钟，取值有：
<li>5：5 分钟粒度，返回指定查询时间内5分钟粒度的明细数据。</li>
<li>1440：天粒度，返回指定查询时间内1天粒度的数据。起始时间和结束时间跨度大于24小时，只支持天粒度的数据。</li>
当 StartTime 和 EndTime 时间跨度大于24小时时，DataInterval 默认为 1440。 
     * @return DataInterval 每条数据的时间粒度，单位：分钟，取值有：
<li>5：5 分钟粒度，返回指定查询时间内5分钟粒度的明细数据。</li>
<li>1440：天粒度，返回指定查询时间内1天粒度的数据。起始时间和结束时间跨度大于24小时，只支持天粒度的数据。</li>
当 StartTime 和 EndTime 时间跨度大于24小时时，DataInterval 默认为 1440。
     */
    public Long getDataInterval() {
        return this.DataInterval;
    }

    /**
     * Set 每条数据的时间粒度，单位：分钟，取值有：
<li>5：5 分钟粒度，返回指定查询时间内5分钟粒度的明细数据。</li>
<li>1440：天粒度，返回指定查询时间内1天粒度的数据。起始时间和结束时间跨度大于24小时，只支持天粒度的数据。</li>
当 StartTime 和 EndTime 时间跨度大于24小时时，DataInterval 默认为 1440。
     * @param DataInterval 每条数据的时间粒度，单位：分钟，取值有：
<li>5：5 分钟粒度，返回指定查询时间内5分钟粒度的明细数据。</li>
<li>1440：天粒度，返回指定查询时间内1天粒度的数据。起始时间和结束时间跨度大于24小时，只支持天粒度的数据。</li>
当 StartTime 和 EndTime 时间跨度大于24小时时，DataInterval 默认为 1440。
     */
    public void setDataInterval(Long DataInterval) {
        this.DataInterval = DataInterval;
    }

    /**
     * Get 点播[子应用](/document/product/266/14574) ID。如果要访问子应用中的资源，则将该字段填写为子应用 ID；否则无需填写该字段。 
     * @return SubAppId 点播[子应用](/document/product/266/14574) ID。如果要访问子应用中的资源，则将该字段填写为子应用 ID；否则无需填写该字段。
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set 点播[子应用](/document/product/266/14574) ID。如果要访问子应用中的资源，则将该字段填写为子应用 ID；否则无需填写该字段。
     * @param SubAppId 点播[子应用](/document/product/266/14574) ID。如果要访问子应用中的资源，则将该字段填写为子应用 ID；否则无需填写该字段。
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    public DescribeCDNStatDetailsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCDNStatDetailsRequest(DescribeCDNStatDetailsRequest source) {
        if (source.Metric != null) {
            this.Metric = new String(source.Metric);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.DomainNames != null) {
            this.DomainNames = new String[source.DomainNames.length];
            for (int i = 0; i < source.DomainNames.length; i++) {
                this.DomainNames[i] = new String(source.DomainNames[i]);
            }
        }
        if (source.Area != null) {
            this.Area = new String(source.Area);
        }
        if (source.Districts != null) {
            this.Districts = new String[source.Districts.length];
            for (int i = 0; i < source.Districts.length; i++) {
                this.Districts[i] = new String(source.Districts[i]);
            }
        }
        if (source.Isps != null) {
            this.Isps = new String[source.Isps.length];
            for (int i = 0; i < source.Isps.length; i++) {
                this.Isps[i] = new String(source.Isps[i]);
            }
        }
        if (source.DataInterval != null) {
            this.DataInterval = new Long(source.DataInterval);
        }
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Metric", this.Metric);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamArraySimple(map, prefix + "DomainNames.", this.DomainNames);
        this.setParamSimple(map, prefix + "Area", this.Area);
        this.setParamArraySimple(map, prefix + "Districts.", this.Districts);
        this.setParamArraySimple(map, prefix + "Isps.", this.Isps);
        this.setParamSimple(map, prefix + "DataInterval", this.DataInterval);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);

    }
}

