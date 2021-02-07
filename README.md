An implementation of the [Framingham CVD risk score](https://en.wikipedia.org/wiki/Framingham_Risk_Score) with [DMN](https://drools.org/learn/dmn.html)

# Disclaimer
**Not medical advice. Always seek professional medical advice.**
The content on this repository is provided for informational purposes only and is not intended as a medical advice, or a substitute for the medical advice of a doctor/physician.

The content on this repository is intended only as a methodological exercise to translate a scientific paper publication into a standardised executable DMN model.

Model features and labels are modeled as expressed with consideration from the original paper; that is for inputs:
```
age, sex, high blood pressure, smoking, dyslipidemia, and diabetes
```
and for outputs:
```
Framingham score, CVD Risk [%], Heart age/vascular age [y]
```

# References

- [General Cardiovascular Risk Profile for Use in Primary Care, The Framingham Heart Study](https://www.ahajournals.org/doi/pdf/10.1161/CIRCULATIONAHA.107.699579)
- [Healthcare Analytics Made Simple, by Vikas Kumar, Packt Publishing, July 2018, ISBN: 9781787286702](https://www.packtpub.com/product/healthcare-analytics-made-simple/9781787286702)
- [Learn DMN](https://drools.org/learn/dmn.html)
- [BPM+Health](https://www.bpm-plus.org)